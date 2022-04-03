 public String reverseParentheses(String s) {
        StringBuilder strb=new StringBuilder();
        Stack<Character> mainStack=new Stack<>();
        Queue<Character> que=new ArrayDeque<>();
        for(char ch : s.toCharArray()){
        if(ch!=')'){
            mainStack.push(ch);
        }
         else 
         {   while(mainStack.peek()!='('){
                que.add(mainStack.pop());
            }
            mainStack.pop();
            while(que.size()>0){
                mainStack.push(que.remove());
            }}
        }
       char[] charac=new char[mainStack.size()];
        for(int i=charac.length-1;i>=0;i--){
            charac[i]=mainStack.pop();
        }
        return new String(charac);
    }
