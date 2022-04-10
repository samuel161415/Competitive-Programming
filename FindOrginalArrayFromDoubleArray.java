 public int[] findOriginalArray(int[] changed) {
        if(changed.length%2 != 0)
            return new int[0];
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i: changed){
            if(hm.containsKey(i))
                hm.put(i, hm.get(i)+1);
            else
                hm.put(i, 1);
        }
        
        Arrays.sort(changed);
        
        int[] ans = new int[changed.length/2];
        
        int index = 0;
        
        for(int i: changed){
            if(hm.getOrDefault(i, 0) <= 0)
                continue;
            
            if(hm.getOrDefault(2*i, 0) <= 0)
                return new int[0];
            
            ans[index++] = i;
            
            hm.put(i, hm.get(i)-1);
            hm.put(2*i, hm.get(2*i)-1);
        }
        
        return ans;
    }
