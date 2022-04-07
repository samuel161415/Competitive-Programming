public int minPairSum(int[] nums) {
        Arrays.sort(nums);
       int start=0;
        int max=0;
        int end=nums.length-1;
        while(start<end){
            if((nums[start]+nums[end])>max) max=nums[start]+nums[end];
            start++;
            end--;
        }
        return max;
    }
