class MyQueue {

    Stack<Integer> stackOne = new Stack<>();
    Stack<Integer> stackTwo = new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        stackOne.push(x);
    }
    
    public int pop() {
        int currentValue = 0;
        if(!stackTwo.isEmpty()){
            currentValue = stackTwo.pop();
        }else{
            while(!stackOne.isEmpty()){
                stackTwo.push(stackOne.pop());
            }
            currentValue = stackTwo.pop();
            
        }
        return currentValue;
    }
    
    public int peek() {
          int currentValue = 0;
        if(!stackTwo.isEmpty()){
            currentValue = stackTwo.peek();
        }else{
            while(!stackOne.isEmpty()){
                stackTwo.push(stackOne.pop());
            }
            currentValue = stackTwo.peek();
            
        }
        return currentValue;
        
    }
    
    public boolean empty() {
        if(stackOne.isEmpty()&&stackTwo.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
