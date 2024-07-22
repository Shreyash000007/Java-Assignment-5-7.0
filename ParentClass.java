public class ParentClass
{
  // prepare a method Name with name as parameter and return it by using String return type
  public String method9(String name)
  {
    return name;
  }
  public static void main(String[] args) 
  {
    ParentClass aobj=new ParentClass();
    
    String names=aobj.method9("Shreyash");
    System.out.println("This is my "+names);
  }
}
