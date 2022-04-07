 public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int start=0;
        int end=piles.length-2;
        int result=0;
        while(start<end){
            result+=piles[end];
            end-=2;
            start++;
        }
        return result;
    }
