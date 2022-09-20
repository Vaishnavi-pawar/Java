class Loop4
{
public static void main(String a[])
{
    int i;
    int e=0,o=0,even=0,odd=0;
    for(i=1;i<=10;i++)
    {
        if(i%2==0)
        {
        System.out.println(i+" is even no");
        e++;
        even=even +i;
        }
        else
        {
        System.out.println(i + " is odd no");
        o++;
         odd = odd + i;
        }
     }
            System.out.println("Total even no= "  + e);
            System.out.println("Total odd no = " + o);
            System.out.println("Total of even no = " + even);
            System.out.println("Total of odd no = " + odd);
            System.out.println("Total of all no = " + (even+odd));
    }
}
