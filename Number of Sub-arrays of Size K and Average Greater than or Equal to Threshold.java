class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {


        int count = 0;
        double  wSum = 0;
        for(int i=0; i<k; i++)
        {
            wSum  += arr[i];
        }
        double avg = (wSum / k );
        System.out.println(avg );
        if((wSum / k ) >= threshold)
        {
            count ++; 
        }
        for(int i=k; i<arr.length; i++)
        {
            wSum = wSum + arr[i] - arr[i-k];
            avg = (wSum / k);
            System.out.println(avg);
            if(avg >=  threshold ) count++;
        }
        return count;


        

    }
}