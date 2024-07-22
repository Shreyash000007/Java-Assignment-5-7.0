public class Loops
{
   public void method1()
   {
    for (int i=0;i<=10;i++)
    {
        System.out.println("Shreyash = " + i);
    }
    
   }
      public void method2()
      {
        int a=11;
        while (a<=20) 
        {
            System.out.println("Arghode = "+a);
            a++;
        }
      }
   public static void main(String[] args) 
   {
    new Loops().method1();
    new Loops().method2();
   }

}
