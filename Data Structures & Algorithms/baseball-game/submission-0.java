class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int top=s.pop();
                int newTop=top+s.peek();
                s.push(top);
                s.push(newTop);
            }else if(operations[i].equals("D")){
                int a=s.peek();
                s.push(2*a);
            }else if(operations[i].equals("C")){
                s.pop();
            }else{
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        for(int score:s) sum+=score;
        return sum;
    }
}