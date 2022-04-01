import java.util.*;
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
         List<Boolean> result=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int start=l[i];
            int end=r[i];
            int[] arr=new int[end+1-start];
            for(int j=0;j<arr.length;j++){
                arr[j]=nums[start+j];    
            }
            result.add(res(arr));
        }
        return result;
    }
    public boolean res(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]-arr[i-1]!=arr[i+1]-arr[i])  return false;
        }
        return true;
    }
}
