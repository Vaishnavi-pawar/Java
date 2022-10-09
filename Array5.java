class Array5
{
  public static void main(String a[])
  {
  String[][] Strname= new String[3][5];

       Strname[0][0]= "Vaish";
       Strname[0][1]= "Parag";
       Strname[0][2]= "Gayatri";
       Strname[1][0]= "Snehal";
       Strname[1][1]= "Shruti";
       Strname[1][2]= "Kunal";
       Strname[2][0]= "Didi";
       Strname[2][1]= "Shravani";
       Strname[2][2]= "Om";
       

    for(int i=0;i<Strname.length;i++)
	{
	for(int j=0;j<Strname.length;j++)
	{
	System.out.print(Strname[i][j]+"      ");
	}
	System.out.println( );
	}

  }
}
