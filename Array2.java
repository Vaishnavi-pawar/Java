class Array2
{
	public static void main(String a[])
	{
	int arr1[] = {20,30,40};
	int[]arr2[] = {{2,1,4},{4,5,6},{7,1,4}};
	for(int i=0;i<arr1.length;i++)
	{
	System.out.println(arr1[i]);
	}
	System.out.println("----------------------------------------");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
	System.out.print(arr2[i][j]+" ");
	}
	System.out.println();
	}
	}
}

