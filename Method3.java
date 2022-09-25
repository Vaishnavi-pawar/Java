class Method3
{
    void show()
   {
        System.out.println("Hello");
   }
   static void display()
   {
        System.out.println("display static method");
   }
    public static void main(String a[])
    {
      display();
       Method3 obj = new Method3();
       obj.show();
    }
}
