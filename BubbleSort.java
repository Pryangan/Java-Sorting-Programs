public class BubbleSort
{
	public void sort(int arr[])
	{
		int n = arr.length;
		boolean swapped;
		
		for(int i = 0;i<n-1;i++)
		{
			swapped = false;
			for(int j = 0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			if(swapped == false)
			{
				break;
			}
		}
	}
	
	public void displaySort(int arr[])
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = {23,12,56,34,11,67};
		ob.sort(arr);
		System.out.println("After Sorting : ");
		ob.displaySort(arr);
	}
}