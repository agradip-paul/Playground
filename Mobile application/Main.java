class MyModel1
{
  int megaPixel = 2;
  public MyModel1()
  {
    System.out.println("Features of MyModel 1");
    System.out.println("Camera mega pixels: " + megaPixel);
  }
}
class MyModel2 extends MyModel1
{
  int megaPixel = 5;
  String lock = "Fingerprint";
  int display = 5;
  public MyModel2()
  {
    System.out.println("Features of MyModel 2");
    System.out.println("Camera mega pixels: " + megaPixel);
    System.out.println("Lock mechanism: " + lock);
    System.out.println("Display size: " + display);
  }
}
class MyModel2T extends MyModel2
{
  int megaPixel = 16;
  int display = 6;
  public MyModel2T()
  {
    System.out.println("Features of MyModel 2T");
    System.out.println("Camera mega pixels: " + megaPixel);
    System.out.println("Lock mechanism: " + lock);
    System.out.println("Display size: " + display);
  }
}
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    MyModel2T model = new MyModel2T();
  }
}