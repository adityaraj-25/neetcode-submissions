class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();

        for (String c : tokens){
            if(c.equals("+")){
                numStack.push(numStack.pop() + numStack.pop());
            } else if (c.equals("-")){
                int a = numStack.pop();
                int b = numStack.pop();
                numStack.push(b-a);
            } else if(c.equals("*")){
                numStack.push(numStack.pop() * numStack.pop());
            } else if(c.equals("/")){
                int a = numStack.pop();
                int b = numStack.pop();
                numStack.push(b/a);
            }
            else {
                numStack.push(Integer.parseInt(c));
            }
        }
        return numStack.pop();
    }
}
