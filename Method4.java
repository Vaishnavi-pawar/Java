class Method4
{
    int no1 = 10 ;  // Instance variable
    static int no2 = 20;  // Static variable

    void show()
    {
        int no3 = 30;  //local variable(stack mm area mdhe store hota)
     System.out.println(no3);  //(main method mdhe , object cha referanc gheun print kraych)
    }
    public static void main(String a[])
    {
        Method4 m = new Method4();
       // System.out.println(no1);  (object referance ghyava lagto trch display hoil)
        System.out.println(m.no1);
        System.out.println(no2);
       // System.out.println(no3);  CTE (local variable fkt jya method mdhe call
       //kelay tithch print hoil , baher nai)
       m.show();
       
    }
}




