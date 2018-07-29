public class SelectionSort
{
	public void sort(int arr[])
	{
		int n = arr.length;
		int min_idx;
		for(int i = 0;i<n-1;i++)
		{
			min_idx = i;
			for(int j = i+1;j<n;j++)
			{
				if(arr[j]<arr[min_idx])
				{
					min_idx = j;
				}
			}
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	
	public void displaySort(int arr[])
	{
		for(int i = 0; i<arr.length;i++)
		 {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {64,12,34,67,11};
		ob.sort(arr);
		System.out.println("After Selection Sort :");
		ob.displaySort(arr);
	}
}