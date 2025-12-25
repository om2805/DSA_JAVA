class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            int cur = a[i];

            while (!st.isEmpty() && st.peek() > 0 && cur < 0) {
                if (Math.abs(st.peek()) < Math.abs(cur)) {
                    st.pop(); 
                } 
                else if (Math.abs(st.peek()) == Math.abs(cur)) {
                    st.pop();
                    cur = 0;
                    break;
                } 
                else {
                    cur = 0; 
                    break;
                }
            }

            if (cur != 0) {
                st.push(cur);
            }
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}
