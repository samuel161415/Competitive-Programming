public int pivotIndex(int[] nums) {    
int suffix=0;
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            suffix+=nums[i];
        }
        System.out.println(suffix);
        for(int i=0;i<nums.length;i++){
            if(suffix-prefix==nums[i]) return i;
            suffix-=nums[i];
            prefix+=nums[i];
        }
        return -1;
       
}