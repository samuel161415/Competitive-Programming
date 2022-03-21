

class Result {

    public static void countSwaps(List<Integer> a) {
        int[] arr = new int[a.size()];
        int count=0;
        for (int i = 0; i < a.size(); i++)
            arr[i] = a.get(i);
            
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp=arr[j];
                    arr[j]=arr[j + 1];
                    arr[j + 1]=temp;
                    count++;
                }
            }
            
        }
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[arr.length-1]);
        
        
    }

}

