class Solution {
    public List<Integer> pathInZigZagTree(int label) {

        ArrayList<Integer> heap = new ArrayList<>();
        int l = 0;

        int num = 1;
        while(heap.size()<=label){
            ArrayList<Integer> list = new ArrayList<>();
            int n = (int )Math.pow(2,l);
            for(int i=0;i <n; i++){
                list.add(num);
                num++;
            }
            if(l%2 == 1) Collections.reverse(list);
            heap.addAll(list);
            l++; 
        }

        LinkedList <Integer> ans = new LinkedList<>();
        int n = heap.indexOf(label);
        while(n!=0){
            //System.out.print(n + " ");
            ans.addFirst(heap.get(n));
            n = (n-1)/2;
        }
        ans.addFirst(1);
       
        
        return ans;
        
    }
}