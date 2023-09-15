import java.util.*;
class Exp2_3
{
    public static void main(String[] args)
    {
        System.out.println("Todays date is : 7 09 2022");
        Scanner sc = new Scanner(System.in);
        int[] mon = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int y=365;
        int dd,mm,yyyy;
        System.out.println("enter a date your choice in dd mm yyyy formate:");
        dd=sc.nextInt();
        mm=sc.nextInt();
        yyyy=sc.nextInt();
        int days=1,i=0,y1=2022,m1=9,d1=7;
        if(mm>m1)
        {
            days=1;
            for(i=mm+1;i<=12;i++)
            days=days+mon[i];
            for(i=0;i<m1;i++)
            days=days+mon[i];
            days=days+(mon[mm]-dd)+d1+(y*(y1-yyyy-1));

        }
        if(m1>mm)
        {
            days=1;
            for(i=mm+1;i<m1;i++)
            days=days+mon[i];
            days=days+(mon[mm]-dd)+d1+(y*(y1-yyyy));
        }
        System.out.println("the number of days between the date "+dd+" "+mm+" "+yyyy+" and 7 09 2022 is "+ days );
    }

}