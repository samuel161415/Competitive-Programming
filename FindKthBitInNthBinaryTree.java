public char findKthBit(int n, int k) {
        HashMap<Integer,String> hash=new HashMap<>();
        return result(n,hash).charAt(k-1);
    }
    public String result(int n,HashMap<Integer,String> hash){
        if (n==1) return "0";
        if(!hash.containsKey(n)) hash.put(n,result(n-1,hash)+"1"+ invert(result(n-1,hash)));
         return hash.get(n);
    
    }
    public String invert(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0') sb.append("1");
            else sb.append("0");
        }
        return sb.reverse().toString();
    }
