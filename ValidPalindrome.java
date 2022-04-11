 public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
      for(int i=0;i<s.length();i++){
          if(Character.isAlphabetic(s.charAt(i))||Character.isDigit(s.charAt(i))) sb.append(s.charAt(i));
      }
        System.out.println(sb);
        String result1=sb.toString().toLowerCase();
        String result2=sb.reverse().toString().toLowerCase();
        System.out.println(result1+" "+result2);
       if(result1.equals(result2)) return true;
        return false;
    }
