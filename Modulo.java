/**
 
 * @version 1.0 vom 23.01.2018
 */
import javax.swing.*;
public class Modulo
{
  
  public static void main(String args[])
 {
    // Definition String Variable f�r weitere Berechnung
    String zahl = JOptionPane.showInputDialog("Hallo, bitte geben Sie eine Zahl ein");
    
    //Ausgabe der zahl
    JOptionPane.showMessageDialog(null,"Der Zahl lautet " + zahl );
    
    // Definition double, Umwandlung: string in double
    double rWert = Double.parseDouble(zahl);
    double modulo = ( 25 % rWert );
    
    
    // Ausgabe der Ergebnisse
    JOptionPane.showMessageDialog(null,
                                        "Das Ergebnis lautet "+ modulo);  
                                        //"\nDer Fl�che des Kreises  " + flaeche + "mm\u00b2");
    
    
    
  // Ende Attribute
   }
  // Anfang Methoden
  // Ende Methoden
}
  // Anfang Attribute
  // Ende Attribute
  
  // Anfang Methoden
  // Ende Methoden
 // end of Modulo

