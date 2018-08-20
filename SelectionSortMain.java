package selectionSort;
import java.util.Arrays;

public class SelectionSortMain {

	public static int[] selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
				if(arr[j]<arr[index])
					index=j;
			
			int smallNumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallNumber;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {40,10,-30,45,39,32};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		arr=selectionSort(arr);
		System.out.println("==========================");
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));

	}

}
