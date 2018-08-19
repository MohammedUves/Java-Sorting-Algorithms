package mergeSort;

public class MergeSortMain {

	static int arr[]= {100,20,15,30,5,75,40};
	
	public static void main(String[] args) {
		
		//Print Array before merge sort
		System.out.println("Array Before Sorting");
		printArray(arr,0,arr.length-1);
		System.out.println("--------------------------------");
		mergeSort(0,arr.length-1);
		System.out.println("--------------------------");
		//Print Array After Sorting
		System.out.println("Array after sorting");
		printArray(arr,0,arr.length-1);
}
	//Recursive algorithm for merger sort
	public static void mergeSort(int start,int end) 
	{
		int mid=(start+end)/2;
	
		if(start<end)
		{
			//Sort left half
			mergeSort(start,mid);
			//Sort right half
			mergeSort(mid+1,end);
			//merge left and right
			merge(start,mid,end);
		}
	}
	
	private static void merge(int start,int mid,int end)
	{
		{
			//Initializing temp arrat and index
			int[] tempArray=new int[arr.length];
			int tempArrayIndex=start;
			
			System.out.print("Before Merging: ");
			printArray(arr,start,end);
			
			int startIndex=start;
			int midIndex=mid+1;
			
			//It will iterate until smaller list reaches to the end
			
			while(startIndex<=mid&&midIndex<=end)
			{
				if(arr[startIndex]<arr[midIndex])
				{
					tempArray[tempArrayIndex++]=arr[startIndex++];
				}
				else
				{
					tempArray[tempArrayIndex++]=arr[midIndex++];
				}
			}
			//Copy Remaining elements
			while(startIndex<=mid)
			{
				tempArray[tempArrayIndex++]=arr[startIndex++];
			}
			
			while(midIndex<=end)
			{
				tempArray[tempArrayIndex++]=arr[midIndex++];
			}
			
			//Copy tempArray to the actual array after sorting
			
			for(int i=start;i<=end;i++) {
				arr[i]=tempArray[i];
			}
			
			System.out.print("After Merging: ");
			printArray(tempArray,start,end);
			System.out.println();
		}
	}
	
	public static void printArray(int arr[],int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
