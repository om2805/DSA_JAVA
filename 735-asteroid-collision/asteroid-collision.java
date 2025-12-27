class Solution {
    public int[] asteroidCollision(int[] a) {
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<a.length;i++){
          int temp=a[i];
          if(st.isEmpty()|| a[i]>0) st.push(temp);
          else {
                while (!st.isEmpty() && st.peek() > 0 && -temp > st.peek()) {
                    st.pop();
                }
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(temp);
                } else if (st.peek() == -temp) {
                    st.pop();
                }
            }
      }
        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--) ans[i]=st.pop();
        return ans;
    }
}