class Solution {
    public int numberOfSteps(int n) {
        if(n==1 || n==0) return n;
        return helper(n); 
    }
    static int helper(int n){
        if(n==0) return 0;
        int s=n%2;
        if(s==1) return 1+ helper(n-1);
        return 1 + helper(n/2);
    }
}