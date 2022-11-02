import java.util.*;
public class vehicle{
vehicle(){
System.out.println("vehicle running");
}
vehicle (int d,int t)
{
System.out.println("speed of vehicle is :"+(d/t)+"km/h");
}
public static void main(String [] args)
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the distance travelled and time taken");
a=sc.nextInt();
b=sc.nextInt();
vehicle v1=new vehicle();
vehicle v2=new vehicle(a,b);
}
}
