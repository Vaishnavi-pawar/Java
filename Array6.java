/*class Array6
{
  public static void main(String yahoo[])
  {
    yahoo[0]="Hello"; //ArrayIndexOutOfBoundsException
    yahoo[1]="Java";

    System.out.println(yahoo[0]+" "+yahoo[1]);
  }
}
void display(int arr[])

int no[];
no[]=new int[]
no[1]=5;
no[2]=4;
no[3]=7;
display(no)*/

/*class Array6
{
  public static void main(String yahoo[])
  {
   String firstName =  yahoo[0];
    String secondName =  yahoo[1];

    System.out.println(yahoo[0]+" "+yahoo[1]);
    System.out.println(firstName+" "+secondName);
    //javac Array6.java
    // java Array6 ani ith don nav takayche(java Array vaish pawar)
  }
}*/
/*class Array6
{
  public static void main(String yahoo[])
  {
  // String str[]=yahoo;

    for(int i=0; i<yahoo.length;i++)
    {
        System.out.println(yahoo[i]);
    }
  }
}*/
/*class Array6
{
  public static void main(String yahoo[])
  {
   //String str[]=yahoo;

    int no1[]={1,5,3,6};
    int no2[]=no1;

    for(int i=0; i<no2.length;i++)
    {
        System.out.println(no2[i]);
    }
  }
}*/
/*class Array6
{
  public static void main(String yahoo[])
  {
   // int no1 = yahoo[0];  types: String cannot be converted to int
  int no1 =Integer.parseInt(yahoo[0]);
   int no2 =Integer.parseInt(yahoo[1]);

    int sum = no1+no2;
    System.out.println("Sum = " +sum);
//javac Array6.java
//java Array6 10 20
//Sum = 30
  }
}*/
/*class Array6
{
  public static void main(String yahoo[])
  {
    System.out.println(yahoo[0]+yahoo[1]);
    System.out.println(Integer.parseInt(yahoo[0])+Integer.parseInt(yahoo[1]));
    System.out.println(10+20);
    System.out.println(10+20+"hello"+10+4);
//java Array6 10 20
/*output
        1020
        30
        30
    30hello104
  }
  }*/
/*import java.util.Scanner;
class Array6
//import java.lang.Integer;

// import java.util.*;  NEVER Used this

{
  public static void main(String yahoo[])
  {
    int age;
    String name;
    float salary;
    char gender;
    
    Scanner() scanner= new Scanner(System.in);

    System.out.println("Enter name :  ");
    name=scanner.next();

    System.out.println("Enter age :  ");
    age=scanner.nextInt();

    System.out.println("Entersalary :  ");
    salary=scanner.nextFloat();

    System.out.println("Enter gender :  ");
    gender=scanner.next().charAt(0);

    System.out.println("Name = " +name);
    System.out.println("age = " +age);
    System.out.println("salary = " +salary);
    System.out.println("Ngender = " +gender);

  }
}*/
/*class Array6
{
    public static void main(String yahoo[])
    {
        int no1[]=new int[4];
        int no2[]=new int[4];
        int no3[]=no1;
        int no4[]={5,4,3};
        int no5[]={5,4,3};

        if(no1==no2)
        {
        System.out.println("same");
        }
        else
        {
            System.out.println("Not same");
        }
          if(no1==no3)
        {
        System.out.println("same");
        }
        else
        {
            System.out.println("Not same");
        }
         if(no1==no4)
        {
        System.out.println("same");
        }
        else
        {
            System.out.println("Not same");
    }
}
}*/

class Array6
{
    public static void main(String yahoo[])
    {
        int d1[]=new int[4];
        int d2[]=new int[4];
        int d3[]=d1;


        if(d1==d2)
        {
        System.out.println("same");
        }
        else
        {
            System.out.println("Not same");
        }
          if(d1==d3)
        {
        System.out.println("same");
        }
        else
        {
            System.out.println("Not same");
        if(d2==d3)
        {
        System.out.println("same");
        }
        else
        {
            System.out.println("Not same");
    }
    }
}
}