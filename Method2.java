class Method2
{
   void add()
   {
        int no1 = 10 , no2 = 5;
        int sum = no1+no2;
        System.out.println(sum);

        //System.out.println(no1+no2);
   }
   void add1(int no1 , int no2)
   {
        int sum = no1+no2;
        System.out.println(sum);

         //System.out.println(no1+no2);
   }
   public static void main(String a[])
   {
        Method2 hello = new Method2();
        hello.add();
        int n1=10 , n2=8;
        hello.add1(n1 , n2);
        hello.add1(20 , 3);
   }
}