public int compress(char[] chars) {
        String result="";
        int count=1;
        char temp=chars[0];
        for(int i=1;i<chars.length;i++){
            if(chars[i]==temp) count++;
            else {
                if(count==1) result=result+temp;
                else result=result+temp+count;
                temp=chars[i];
                count=1;
            }
        }
        if(count==1) result=result+temp;
        else
        result=result+temp+count;

        for(int i=0;i<result.length();i++){
            chars[i]=result.charAt(i);
        }
        return result.length();
    }
