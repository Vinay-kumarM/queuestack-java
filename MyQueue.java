Implement Queue using Stacks


class MyQueue {
      private Stack<Integer> stack1;
        private Stack<Integer> stack2;
       public MyQueue(){
            this.stack1=new Stack<>();
            this.stack2=new Stack<>();
        }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        int k;
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        k=stack2.pop();
         while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return k;
    }
    
    public int peek() {
 while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
}
   int ele=stack2.peek();
   while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return ele;

    }
    
    public boolean empty() {
        if(stack1.isEmpty()){
            return true;
        }
        return false;
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