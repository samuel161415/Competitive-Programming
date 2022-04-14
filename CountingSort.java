  public static List<Integer> countingSort(List<Integer> arr) {
   int[] array=new int[100];
   List<Integer> list=new ArrayList<>();
   for(int i=0;i<arr.size();i++){
       array[arr.get(i)]++;
   }
   for(int i=0;i<array.length;i++){
       list.add(array[i]);
   }
   return list;
    }
