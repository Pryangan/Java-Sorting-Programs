public class InsertionSort
{
	public void sort(int arr[])
	{
		int i,key,j;
		for(i = 1 ;i < arr.length;i++)
		{
			key = arr[i];
			j = i - 1;
			while(j>= 0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j = j -1;
			}
			arr[j+1] = key;
		}
	}
	
	public void display(int arr[])
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		InsertionSort ob = new InsertionSort();
		int arr[] = {23,45,12,54,65,11};
		ob.sort(arr);
		ob.display(arr);
	}
}