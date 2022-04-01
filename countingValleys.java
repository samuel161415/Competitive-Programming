   public static int countingValleys(int steps, String path) {
     int res=0;
     int valley=0;
    for(int i=0;i<steps;i++){
        if(path.charAt(i)=='D') res--;
        else if(path.charAt(i)=='U') res++;
        if(res==0&&path.charAt(i)=='U') valley++; 
    }
  return valley;

    }
