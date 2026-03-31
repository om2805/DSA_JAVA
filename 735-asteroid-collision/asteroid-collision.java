class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            int flag = 0;
            while (!st.isEmpty() && a[i] < 0) {
                if (st.peek() > 0) {
                    int n = Math.abs(a[i]);
                    int m = Math.abs(st.peek());

                    if (n == m) {
                        st.pop();
                        flag = 1;
                        break;
                    } else if (m > n) {
                        flag = 1;
                        break;
                    } else {
                        st.pop();
                    }
                }
                else break;
            }
            if (flag == 0)
                st.push(a[i]);
        }

        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--)
            ans[i] = st.pop();
        return ans;
    }
}
