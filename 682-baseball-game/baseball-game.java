class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s1=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                s1.pop();
            }
            else if(s.equals("D")){
                int a=s1.peek();
                s1.push(2*a);
            }
            else if(s.equals("+")){
                int a=s1.pop();
                int b=s1.pop();
                s1.push(b);
                s1.push(a);
                s1.push(a+b);
            }
            else{
                int a=Integer.parseInt(s);
                s1.push(a);
            }
        }
        int sum=0;
        while(!s1.isEmpty()){
            sum+=s1.pop();
        }
        return sum;
    }
}