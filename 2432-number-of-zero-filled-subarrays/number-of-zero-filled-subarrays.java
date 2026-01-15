class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long st=0;
        boolean sw=false;

        long ocr=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && sw==false) {
                st=i;
                sw=true;
            }
            if(sw==true && nums[i]!=0){
                sw=false;
                long n=(long)i-st;
                ocr+=(n*(n+1))/2;
            }
        }
        if(sw==true){
            long n=(long)nums.length-st;
            ocr+=(n*(n+1))/2;
        }
        return ocr;
    }
}