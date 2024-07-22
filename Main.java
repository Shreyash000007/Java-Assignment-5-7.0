// Scanner Implementations

import java.util.Scanner;

public class Main
{
    public void method8()
    {
        Scanner aobj=new Scanner(System.in);
        int a=aobj.nextInt();
        System.out.println("Enter your int number = "+a);
        Float b=aobj.nextFloat();
        System.out.println("Enter Your String Value = "+b);


    }
    public static void main(String[] args) {
        new Main().method8(); 
    }
    
}
