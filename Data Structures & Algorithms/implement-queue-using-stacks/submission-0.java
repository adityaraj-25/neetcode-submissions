class MyQueue {
    Stack<Integer> st;
    public MyQueue() {
        st=new Stack<>();
    }
    
    public void push(int x) {
        if(st.isEmpty()) st.push(x);
        else{
            List<Integer> l=new ArrayList<>();
            while(!st.isEmpty()) l.add(st.pop());
            st.push(x);
            for(int i=l.size()-1;i>=0;i--) st.push(l.get(i));
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */