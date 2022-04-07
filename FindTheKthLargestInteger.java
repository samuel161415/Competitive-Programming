  public String kthLargestNumber(String[] nums, int k) {
    
        Arrays.sort(nums,(a,b) -> a.length()!=b.length() ? a.length() - b.length() : a.compareTo(b));        
        return nums[nums.length - k];
    
    }
