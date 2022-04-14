 public int removeElement(int[] nums, int val) {
     int slow=0;
    int  fast=1;
        while(fast<nums.length){
            if(nums[slow]==val&&nums[fast]!=val) {
                int temp=nums[slow];
                nums[slow]=nums[fast];
                nums[fast]=temp;
                slow++;
                fast++;
            }
            else if(nums[slow]==val&&nums[fast]==val){
                fast++;
            }
            else{
                fast++;
                slow++;
            }
            
        }
        int count=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]!=val) count++;
          else break;
      }
        return count;
    }
