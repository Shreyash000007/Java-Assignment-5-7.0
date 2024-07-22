import java.util.Scanner;

public class IfElse
{
//Take a variable and scan value using Scanner
  // Make Conditions using if else
  public void method7()
  {
    Scanner aobj=new Scanner(System.in);
    int a=aobj.nextInt();
    System.out.println("Enter the First number = " + a);
    int b=aobj.nextInt();
    System.out.println("Enter the Second  number = "+b);
if (a<b) 
{
  System.out.println("A is Smaller than B");
}
else if (a==b)
{
  System.out.println("A and B are equal");
}
else
{
  System.out.println("B is Smaller than A");
}
}
  public static void main(String[] args) 
  {
    new IfElse().method7();
  }
}
