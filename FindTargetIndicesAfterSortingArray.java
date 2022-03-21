 public List<Integer> targetIndices(int[] nums, int target) {
         Arrays.sort(nums);
        List<Integer> targetList=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) targetList.add(i);
        }
        return targetList;
    }
