public class Functions
{
  public void method3()
  {
    System.out.println(" void function");
  }
  public void method4(int a,int b)
  {
    int d=a+b;
    System.out.println("Sum of "+a +" and "+b+" = "+d);
  }
  public int method6(int c)
  {
    return c+2;
  }

// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public static void main(String[]args)
  {
  Functions f=new Functions();
  // Call three Functions here
  f.method3();
  f.method4(10, 20);
  int result=f.method6(10);
  System.out.println("10 x 2 = " + result);
  }
}
