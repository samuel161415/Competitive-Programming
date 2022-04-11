 public String largestNumber(int[] nums) {
        String[] strArray = new String[nums.length];
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            strArray[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strArray,new Comparator<String>(){
           @Override
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });
        if(strArray[0].equals("0")) return "0";
        for(String i:strArray){
            sb.append(i);
        }
        return sb.toString();
    }
