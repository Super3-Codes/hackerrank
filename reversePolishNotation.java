 public int evalRPN(String[] tokens) {
        int a , b ;
        Stack<Integer> stack = new Stack<>();
        
        for(String str:tokens){
            if(str.equals("+")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a+b);
            }else if(str.equals("/")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a/b);
            }else if(str.equals("*")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a*b);
            }else if(str.equals("-")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a-b);
            }else{
                stack.add(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
