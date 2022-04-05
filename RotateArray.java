 public void rotate(int[] nums, int k) {
       if(k>nums.length){
         k = k%nums.length;
     }
     int [] result = new int[nums.length];
     System.arraycopy(nums, nums.length-k, result, 
                                       0, k);
     for(int i=0;i<nums.length-k ;i++){
        result[k+i] = nums[i];
     }
     System.arraycopy(result,0,nums,0,result.length);
    }
