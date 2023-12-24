class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0; i<image.length ; i++){
            int n = image[i].length;
            int arr [] = new int [n];
            int k=n-1;
            for(int j=0; j<n; j++){
                if(image[i][j]==0)  image[i][j]= 1;
                else image[i][j]=0;
                arr[k] = image[i][j];
                k--;
            }
            image[i] = arr;
        }
        return image;



        
        
   


}}