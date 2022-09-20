class Loop3
{
    public static void main(String a[])
    {
        int i = 1;
        int sum = 0;

        do
        {
            System.out.println(i);
            sum = sum+i;
            i++;
        }
        while(i<=10);
        System.out.println("add =" +sum);
    }
}
