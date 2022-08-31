package mechanicprojects;

import javax.swing.*;
public class Parcel 
{
       public static void  parcelM()
  {
           

    int n = JOptionPane.showConfirmDialog(
            null,
            "Wollen Sie die Dienste von Super Parcel Services in Anspruch nehmen?",
            "Super Parcel Services",
            JOptionPane.YES_NO_OPTION);

        if(n == JOptionPane.YES_OPTION){ JOptionPane.showMessageDialog(null, "Danke, dass Sie die Dienste des Super Parcel Services in Anspruch nehmen");   preis();}
        
        else{JOptionPane.showMessageDialog(null, "Wir bedauern, Sie nicht als User begrüßen zu dürfen und wünschen Ihnen noch einen schönen Tag");}
  }  
    
    private static void preis() 
  { 
    //Deklaration String Variable gw zuweisen der Eingabe  auf gw
        Mechanic256 M256 = new Mechanic256(); 
         String gewicht = JOptionPane.showInputDialog("Hallo, bitte ein Gewicht in kg eingeben:");
         if (gewicht == null) {System.out.println("aborted");M256.backToMain();}
         else{
                double foo = Double.parseDouble(gewicht);
                JOptionPane.showMessageDialog(null, "Ihr zu verschickendes Paket wiegt " + foo + " kg");


           // If-Abfragen um den eingegebenen Gewichtswert einem Preis zuzuorden


                   if (foo<=1.5)
                   {
                     JOptionPane.showMessageDialog(null, "Das Paket kostet 3,49€");
                   }
                   else if(foo<=3)
                   {
                      JOptionPane.showMessageDialog(null, "Das Paket kostet 4,79€");
                   } // end of if-else
                   else if(foo<=7)
                   {
                      JOptionPane.showMessageDialog(null, "Das Paket kostet 5,79€");
                   }
                   else if(foo<=15)
                   {
                      JOptionPane.showMessageDialog(null, "Das Paket kostet 6,99€");
                   }
                   else if(foo<=31.5)
                   {
                      JOptionPane.showMessageDialog(null, "Das Paket kostet 11,99€");
                   }
                   else
                   {
                        JOptionPane.showMessageDialog(null, "Das Paket ist doch viel zu schwer");
                   }
                    preis(); 
                    // end of if-else
            }
  }   
   
    
  // Anfang Attribute
  // Ende Attribute
  
  // Anfang Methoden
  // Ende Methoden
} // end of Paket2

