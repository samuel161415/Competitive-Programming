public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int result=0;
        int first=0,second=0;
        for(int i=0;i<tokens.length;i++){
         if(!tokens[i].equals("+")&&!tokens[i].equals("-")&&!tokens[i].equals("*")&&!tokens[i].equals("/")){
             stack.push(Integer.parseInt(tokens[i]));
         }
            else if(tokens[i].equals("+")){
              result=stack.pop()+stack.pop(); 
                stack.push(result);
            }
            else if(tokens[i].equals("-")){
              first=stack.pop();
             second=stack.pop();
                result=second-first;
                stack.push(result);
            }
            else if(tokens[i].equals("*")){
              result=stack.pop()*stack.pop(); 
                stack.push(result);
            }
             else if(tokens[i].equals("/")){
              first=stack.pop();
             second=stack.pop();
                result=second/first;
                stack.push(result);
            }
            
        }
        return stack.pop();
    }
