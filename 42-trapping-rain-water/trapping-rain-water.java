class Solution {
    public int trap(int[] h) {
        int[] preMax=new int[h.length];
        int[] sufMax=new int[h.length];
        int max=h[0];
        for(int i=0;i<h.length;i++) {
            max=Math.max(h[i],max);
            preMax[i]=max;
        }
        max=Integer.MIN_VALUE;
        for(int i=h.length-1;i>=0;i--) {
            max=Math.max(h[i],max);
            sufMax[i]=max;
        }
        int total=0;
        for(int i=0;i<h.length;i++){
            total+= Math.min(preMax[i],sufMax[i]) - h[i];
        }

        return total;
    }
}