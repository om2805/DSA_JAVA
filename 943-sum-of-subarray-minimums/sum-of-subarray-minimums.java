class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nextS=new int[arr.length];
        int[] prevS=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        // prev smaller
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()) prevS[i]=-1;
            else prevS[i]=st.peek();
            st.push(i);
        }
        st.clear();
        ///Next Smaller
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nextS[i]= st.isEmpty()? arr.length:st.peek(); 
            st.push(i);
        }

        long mod= 1000000007;
        long total=0;
        for(int i = 0; i < arr.length; i++){
            long left = i - prevS[i];
            long right = nextS[i] - i;
            total = (total + (arr[i] * left * right) % mod) % mod;
        }
        return (int)total;
        
    }
}