class Solution {
    public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge: edges) {
            graph.get(edge[0]).add(edge[1]);
        }

        if (graph.get(destination).size() > 0) { // destination's outdegree must be 0
            return false;
        }
        
        boolean[] visited = new boolean[n];
        visited[source] = true;

        int[] value = new int[n]; // 0 unchecked, 1 all leas to destination, -1 not all leads to destination
        
        DFS(source, destination, graph, visited, value);
        return value[source] == 1;
    }
    
    private void DFS(int source, int destination, List<List<Integer>> graph, boolean[] visited, int[] value) {
        List<Integer> targets = graph.get(source);

        if (source == destination) {
            value[source] = 1;
            return;
        }

        if (targets.size() == 0) { // end node which is not destination
            value[source] = -1;
            return;
        }
        
        for (int target: targets) {
            if (value[target] == -1) { // the target is already not valid
                value[source] = -1;
                return;
            } else if (value[target] == 1) { // the target is already valid
                continue;
            }
            
            if (visited[target]) { // there is a loop
                value[source] = -1;
                return;
            }
            visited[target] = true;

            DFS(target, destination, graph, visited, value);

            visited[target] = false;

            if (value[target] == -1) { // the target is not valid
                value[source] = -1;
                return;
            }
        }
        
        // All targets are valid
        value[source] = 1;
    }
}