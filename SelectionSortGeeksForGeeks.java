class Solution
{
	int  select(int arr[], int i)
	{
        int index=i;
    int min=arr[i];
     for(int j=i+1;j<arr.length;j++){
         if(min<arr[j]) continue;
         if(arr[j]<min){
             min=arr[j];
             index=j;
         }
     }
     return index;
	}
	
	void selectionSort(int arr[], int n)
	{
	     int temp=0;
 for(int i=0;i<n-1;i++){
    int index=select(arr,i);
    temp=arr[i];
    arr[i]=arr[index];
    arr[index]=temp;
	}
}
}
