public class Person
{
  // Take 4 Variables and Initialize them
  // Create Getters and Setters
  // Create Constructors
  private int id;
  private int rollnumber;
  private String name;
  private String Adress;

  //Constructor//
  
   
  //Getter and Setters//
  public int getid()
  {
    return id;
  }
  public void setid(int id)
  {
    this.id=id;
  }
  public int getrollnumber()
  {
    return rollnumber;
  }
  public void setrollnumber(int rollnumber)
  {
    this.rollnumber=rollnumber;
  }
  public String getname()
  {
    return name;
  }
  public void setname(String name)
  {
    this.name=name;
  }

  public String getAdress() {
    return Adress;
  }

  public void setAdress(String adress) {
    Adress = adress;
  }
  
  public Person(int id,int rollnumber,String name,String Adress)
  {
    this.id=id;
    this.name=name;
    this.rollnumber=rollnumber;
    this.Adress=Adress;
  }
  public static void main(String[] args) 
  {
   Person aobj=new Person(10, 60, "Shreyash", "Raje raguji nagar opp kamla nehru college");
   aobj.setid(20);
   aobj.setrollnumber(61);
   aobj.setname("Avinash");
   aobj.setAdress("Arghode"); 
   System.out.println("my ID Number = "+aobj.getid());
   System.out.println("my Roll Number = "+aobj.getrollnumber());
   System.out.println("my Name = "+aobj.getname());
   System.out.println("my Adress = "+aobj.getAdress());
  }

}
