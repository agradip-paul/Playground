import java.util.Scanner;
class Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("Base Salary: " + baseSalary);
  }
}
class CSE extends Faculty
{
  public void salary1(int baseSalary)
  {
    System.out.println("CSE Faculty: " + (baseSalary + 3000));
  }
}
class IT extends Faculty
{
  public void salary2(int baseSalary)
  {
    System.out.println("IT Faculty: " + (baseSalary + 5000));
  }
}
class ECE extends Faculty
{
  public void salary3(int baseSalary)
  {
    System.out.println("ECE Faculty: " + (baseSalary + 4500));
  }
}
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int baseSalary = in.nextInt();
    if(baseSalary > 0)
    {
      Faculty obj = new Faculty();
      obj.salary(baseSalary);
      CSE obj1 = new CSE();
      obj1.salary1(baseSalary);
      IT obj2 = new IT();
      obj2.salary2(baseSalary);
      ECE obj3 = new ECE();
      obj3.salary3(baseSalary);
    }
    else
      System.out.println("null");
  }
}