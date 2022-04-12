 public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
     int first=1;
     int second=0;
        stack.push(pushed[0]);
        while(second<popped.length-1){
            if(!stack.isEmpty()&&stack.peek()!=popped[second]&&first<pushed.length){
               stack.push(pushed[first]);
                first++;
            } 
             else if(!stack.isEmpty()&&stack.peek()==popped[second]){
                   stack.pop();  
                    second++;
                }
            else if(stack.isEmpty()&&first<pushed.length) stack.push(pushed[first]);
            else return false;
        }
        return true;
    }
