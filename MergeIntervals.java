   public int[][] merge(int[][] intervals) {
        if(intervals.length==1) return intervals;
        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] temp=intervals[0];
       int fast=1;
        while(fast<intervals.length){
             if(temp[1]>=intervals[fast][0]){
               if(temp[1]<=intervals[fast][1]) 
                   {
                   if(fast==intervals.length-1){
                       temp[1]=intervals[fast][1];
                        list.add(temp);
                   }
                else  temp[1]=intervals[fast][1];
                 
               }
                 else {
                 if(fast==intervals.length-1) list.add(temp);
                 }
                 fast++;
            }
            else {
                if(fast==intervals.length-1){
                  list.add(temp);
                list.add(intervals[fast]); 
                    fast++;
                }
                else
                {
                    list.add(temp);
                temp=intervals[fast];
                fast++;
                }
            }
        }
        int[][] result=new int[list.size()][2]; 
        return list.toArray(result);
    }
