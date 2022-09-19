class If2
 {
    public static void main(String centum[])
    {
        int year = 2000;
        
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                   System.out.println("It is Leap year");
                else
                    System.out.println("It is Not Leap year");
            }
        else
        {
            System.out.println("It is not year");
    }
}
}
