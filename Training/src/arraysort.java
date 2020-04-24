
public class arraysort {
	public static void main(String[] args)
	{
		int []arr = new int[]{2,4,1,8,5,6};
		int n = 6;
		int temp = 0;
		System.out.println("Original Array:");
		for(int i= 0;i<n;i++)
		{
			System.out.println(arr[i]+"");
		}
		for(int i = 0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if (arr[i]>arr[j])
						{
							temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
							System.out.println();
							
						}
				System.out.println("Elements of array in sorted order:");
				for(int k = 0;i<n;k++)
				{
					System.out.print(arr[k]+"");
				}
			}
		}
		
	}

}
