class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int s=0;
        int e=minutes;
        int sum=0;
        for(int i=0; i<customers.length; i++) if(grumpy[i]==0) sum+=customers[i];
        int tot=0;
        for(int i=0; i<e; i++) if(grumpy[i]==1) tot+=customers[i];
        int n_tot=tot;
        for(int i=0; i<customers.length-minutes; i++){
            System.out.println(tot);
            if(grumpy[s]==1) n_tot-=customers[s];
            if(grumpy[e]==1) n_tot+=customers[e];
            tot=Math.max(tot, n_tot);
            s++;
            e++;
        }
        System.out.println(tot);
        return sum+tot;
    }
}