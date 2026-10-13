class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String ele:tokens){
            if(ele.equals("+")){
                int b=stack.pop();
                int a =stack.pop();
                stack.push(a+b);
            } else if(ele.equals("-")){
                int b=stack.pop();
                int a =stack.pop();
                stack.push(a-b);
            } else if(ele.equals("*")){
                 int b=stack.pop();
                int a =stack.pop();
                stack.push(a*b);
            } else if(ele.equals("/")){
                 int b=stack.pop();
                int a =stack.pop();
                stack.push(a/b);
            } else{
                stack.push(Integer.parseInt(ele));
            }
        }
        return stack.pop();
    }
}