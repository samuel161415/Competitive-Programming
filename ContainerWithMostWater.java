public int maxArea(int[] height) {
        int[] area=new int[height.length];
        int a=0;
        int first=0;
        int end=height.length-1;
        while(first<end){
           int h= Math.min(height[first],height[end]);
           if(a<(end-first)*h) a=(end-first)*h;
            if(height[first]<height[end]) first++;
            else end--;
        }
        return a;
    }
