package farecalculation;
import java.util.Scanner;
class people
{
    public void display1()
    {
        
        Scanner S=new Scanner(System.in);
        System.out.println("name of the customer");
        String Name=S.nextLine();
        System.out.println("source");
        String source=S.nextLine();
        System.out.println("place");
        String place=S.nextLine();
        System.out.println("destination of the customer");
        String destination = S.nextLine();
        System.out.println("no of seats");
        int noofseats=S.nextInt();
    }
}
class bus extends people
{
    public void display2()
    {
        System.out.println("no of bus tickets booked by the customer");
        
    }
}
class train extends people
{
    public void display3()
    {
      System.out.println("no of train tickets booked by the customer");
    }
    
}
public class farecalculation
{
    public static void main(String args[])
    {
        bus obj1=new bus();
        train obj2=new train();
        obj1.display1();
        obj1.display2();
        obj2.display1();
 
        
    }
}
