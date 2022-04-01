class Solution {
    public int[] rearrangeArray(int[] nums) {
        int prev=0,next=0;
        int temp=0;
        int changes=0;
         int i=1;
        while(true){
            if(i==1) changes=0;
           prev=nums[i-1];
            next=nums[i+1];
            if(nums[i]==(prev+next)/2) {
                changes++;
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
            i++;
            if(i==nums.length-1){
                if(changes==0) break;
                else i=1;
            }
                
        }
           
        
        return nums;
    }
}
