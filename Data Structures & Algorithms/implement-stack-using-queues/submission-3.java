class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        if (q.isEmpty()) {
            q.add(x);
        } else {
            List<Integer> l = new ArrayList<>();

            int size = q.size();
            for (int i = 0; i < size; i++) {
                l.add(q.poll());
            }

            q.add(x);

            for (int num : l) {
                q.add(num);
            }
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */