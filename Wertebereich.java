public class Wertebereich
{
  
  public static void main(String[] args)
  {
    int x = (int) ((Math.random()*49)+1);
    
    if (x >= 10 && x < 20)
    {
      System.out.println("Wert ist im Bereich 10 - 20");
      
    }
    else if (x >= 20 && x < 30)
    {
      System.out.println("Wert ist im Bereich 20 - 30");
      
    }
    else if (x >= 30 && x < 40)
    {
      System.out.println("Wert ist im Bereich 30 - 40");
      
    }
    else
    {
      System.out.println("Wert ist außerhalb der Wertebereiche");
      
    }
    System.out.print("Die Zahl lautet: "+x);
  }
}