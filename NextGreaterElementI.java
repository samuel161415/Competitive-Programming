int[] result=new int[nums1.length];
        Stack<Integer> stack =new Stack<>();
        HashMap<Integer,Integer> hash=new HashMap<>();
           for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty()&& nums2[i]>stack.peek())
            {
            hash.put(stack.pop(),nums2[i]);
            }
             stack.push(nums2[i]);
           }
           
        for(int j=0;j<nums1.length;j++){
            if(hash.containsKey(nums1[j]))
                result[j]=hash.get(nums1[j]);
            else result[j]=-1;
        }
        return result;
       
    }
