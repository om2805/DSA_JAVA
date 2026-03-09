class Solution {
    public int longestOnes(int[] nums, int k) {
        int t=0;
        int zcnt=0;
        int lzind=0;
        boolean flg=false;
        int cur=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
               zcnt++;
            }
            while(zcnt>k){
                if (nums[t] == 0) zcnt--;
                t++;
            }

            cur = i-t+1;
            max=Math.max(cur,max);
        }
        return max;
    }
}