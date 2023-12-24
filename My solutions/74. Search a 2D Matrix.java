class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int n = matrix[0].length;
      for(int [] arr : matrix ){
       
        if(arr[0] <= target && target <= arr[n-1] ){
          return bs(arr , target);
        }
      }
      System.out.print("x");
      return false;
        
    }
    public boolean bs(int [] arr , int t){
      int l = 0;
      int h = arr.length-1;
      int mid = l + (h - l) / 2;
      while(l<=h){
        mid = l + (h - l) / 2;
        if(arr[mid]==t) return true;
        else if (arr[mid]<t)  l = mid+1;
        else h = mid-1; 
      }
      return false;
    }
}