public int numRescueBoats(int[] people, int limit) {
        int start=0;
        int end=people.length-1;
        int count=0;
        Arrays.sort(people);
        if(people[start]>limit) return 0;
        while(start<=end){
            if(people[end]>limit){
               end--;
                continue;
            }
            if(people[end]==limit){
                count++;
                end--;
                continue;
            }
           else{
               if(people[end]+people[start]>limit){
                   count++;;
                   end--;
               }
               else  {
                   count++;;
                   start++;
                   end--;
               }    
               }
           }
        return count;
    }
