class Array3
{
	public static void main(String a[])
	{
	 int[]arr[]= new int[2][3];
        arr[0][0]= 30;
        arr[0][1]= 40;
        arr[0][2]= 50;
        arr[1][0]= 60;
        arr[1][1]= 70;
        arr[1][2]= 80;
	
	for(int i=0;i<2;i++)
	{
	for(int j=0;j<3;i++)
	{
	System.out.println(arr[i][j]+" ");
	}
	System.out.println();
	}
	}
}