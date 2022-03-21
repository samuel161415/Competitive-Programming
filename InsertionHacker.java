  public static void insertionSort1(int n, List<Integer> arr) {
    int number=arr.get(n-1);
    for(int i=n-2;i>=0;i--){
       if(arr.get(i)>number) arr.set(i+1, arr.get(i));
       else arr.set(i+1,number); 
        for(int j=0;j<n;j++) System.out.print(arr.get(j)+" "); 
     System.out.println();
    }

    }
