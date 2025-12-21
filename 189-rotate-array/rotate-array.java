class Solution {
    public void rotate(int[] arr, int k) {
        k%=arr.length;
        arr= reverseArray(arr,0,arr.length-k-1);
        arr= reverseArray(arr,arr.length-k,arr.length-1);
        arr= reverseArray(arr,0,arr.length-1);
        
        
    }
    static int[] reverseArray(int[] array,int start,int end){

         while(start<=end){
             int temp = array[start];
             array[start] = array[end];
             array[end] = temp;
             start++;
             end--;
         }
         return array;
    }
}