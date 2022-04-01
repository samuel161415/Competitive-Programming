public void moveZeroes(int[] nums) {
        if(nums.length<=1) return;
        int slow=0;
        int fast=slow+1;
        while(fast<nums.length){
            if(nums[slow]==0&&nums[fast]!=0) {
                int temp=nums[slow];
                nums[slow]=nums[fast];
                nums[fast]=temp;
                fast++;
                slow++;
            }
            else if(nums[slow]==0&&nums[fast]==0){
                fast++;
            }
            else
               {
                fast++;
                slow++;
               }
        }
    }
