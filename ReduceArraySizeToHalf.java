  public int minSetSize(int[] arr) {
        List<Integer> list=new ArrayList<>();  // used to hold frequencies
        int count=0;
        Arrays.sort(arr);
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==temp) count++;
            else {
                list.add(count);
                count=1;
                temp=arr[i];
            }
        }
        list.add(count);
        
        if(Collections.max(list)>=arr.length/2) return 1;
        Collections.sort(list);
        int sum=0;
        int result=0;
        for(int i=list.size()-1;i>=0;i--){
            sum+=list.get(i);
            result++;
            if(sum>=arr.length/2) break;
        }
        return result;
    }
