 public boolean isValid(String s) {
         Stack<Character> stack= new Stack<Character>();
        // Stack<Character> stackClose=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('||a=='{'||a=='[') stack.push(a);
            
            else if(!stack.isEmpty()&&a==')'&&stack.peek()=='('){
                stack.pop();
            }
            else if(!stack.isEmpty()&&a=='}'&&stack.peek()=='{'){
                stack.pop();
            }
            else if(!stack.isEmpty()&&a==']'&&stack.peek()=='['){
                stack.pop();
            }
            else return false;
        } 
        if(stack.size()!=0) return false;
       
        return true;
    }
