 public int longestOnes(int[] nums, int k) {
        if(nums.length==1&&k!=0) return 1;
        int slow=0;
        int fast=0;
        int temp=k;
        int max=0;
        while(fast<nums.length){
            if(temp>0&&nums[fast]==0){ 
                fast++;
                temp--;
            }
            else if(temp>=0&&nums[fast]!=0) fast++;
            else{
                    slow++;
                    fast=slow;
                    temp=k;
                }
                max=Math.max(max,fast-slow);    
        }
        return max;
    }
