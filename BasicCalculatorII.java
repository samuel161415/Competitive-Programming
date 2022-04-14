 public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char oper = '+';
          s=s.replaceAll("\\s","");
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                 currentNumber = 0;
                 while(i < s.length() && Character.isDigit(s.charAt(i))) {
                     currentNumber *= 10;
                     currentNumber += s.charAt(i++) - '0';
                 }
                 i--;
                 if(oper == '-') currentNumber = - currentNumber;
                 else if(oper == '*') currentNumber = stack.pop() * currentNumber;
                 else if(oper == '/') currentNumber = stack.pop() / currentNumber;
                 stack.push(currentNumber);               
            } 
            else if(ch == '-') oper = '-';
            else if(ch == '+') oper = '+';
            else if(ch == '*') oper = '*';
            else if(ch == '/') oper = '/';  
        } 
        int result = 0;
        while(!stack.isEmpty()) {
            result += stack.pop();
        }
        return result; 
    }
