package mechanicprojects;

import javax.swing.*;

public class Cli 
{
       public static void cliM()
        {cliAbfrage();
                //Mechanic256 M256 = new Mechanic256(); 
                //M256.cliAbfrage();
        }
        public static void cliAbfrage()
           { 
               
                 Mechanic256 M256 = new Mechanic256();  
  
               //     ****Array der Zweierpotenzen
       String[] bin = new String[12];
                bin[0] = "1";
                bin[1] = "2";
                bin[2] = "4";
                bin[3] = "8";
                bin[4] = "16";
                bin[5] = "32";
                bin[6] = "64";
                bin[7] = "128";
                bin[8] = "256";
                bin[9] = "512";
                bin[10] = "1024";
                bin[11] = "2048";
       //       ***** Array der Netzwerkklassen          
       String[] bina = new String[7];
                bina[0] = "128";
                bina[1] = "192";
                bina[2] = "224";
                bina[3] = "240";
                bina[4] = "248";
                bina[5] = "252";
                bina[6] = "253";
       //       ***** Array(2hochb + 2hochb+2)  
       String[] binb = new String[8];
                binb[0] = "10";
                binb[1] = "20";
                binb[2] = "40";
                binb[3] = "80";
                binb[4] = "160";
                binb[5] = "320";
                binb[6] = "640";
                binb[7] = "1280";

       String befehl = JOptionPane.showInputDialog("Dies ist eine minimalistische CLI, die nur den Befehl <bin> mit drei Parametern kennt.\n "
               + "Sie können die CLI auch mit [Hallo] begrüßem ;] \n "
               + "Für jeden Befehl werden Berechnungen von Zweierpotenzen ausgegeben\n "
               + "Welchen Befehl möchten Sie eingeben?\n "
               + "bin \n "
               + "bin -a\n "
               + "bin -b\n "
               + "bin -z\n ");
        if (befehl == null) {System.out.println("aborted");M256.backToMain();}
        else{
                if(befehl.equals("Hallo")){JOptionPane.showMessageDialog(null, "Hi!! Bitte einen gültigen Befehl eingeben!");}
                else if(befehl.equals("bin")){JOptionPane.showMessageDialog(null, bin);cliAbfrage();}
                else if(befehl.equals("bin -a")){JOptionPane.showMessageDialog(null, bina);cliAbfrage();}
                else if(befehl.equals("bin -b")){JOptionPane.showMessageDialog(null, binb);cliAbfrage();}
                else if(befehl.equals("bin -z"))
                {String zahl = JOptionPane.showInputDialog("Geben Sie eine Potenz von 0-11 ein");
                 int i = Integer.parseInt(zahl);
                 JOptionPane.showMessageDialog(null, bin[i]);
                 cliAbfrage();
                }
                else 
                {JOptionPane.showMessageDialog(null, "Unbekannter Befehl");cliAbfrage();}
                }
           }

}
  /*  
   JOptionPane.showMessageDialog(null, Arrays.toString(arr));
   JOptionPane.showMessageDialog(null, new JList(array));
    private static void preis() 
  { 
    
else if(befehl.equals("bin -az"))
        {String zahl = JOptionPane.showInputDialog("Geben Sie eine Zahl von 0-6 ein");
         int i = Integer.parseInt(zahl);
         JOptionPane.showMessageDialog(null, bina[i]);
         cliAbfrage();
        }
        else if(befehl.equals("bin -bz"))
        {String zahl = JOptionPane.showInputDialog("Geben Sie eine Zahl von 0-7 ein");
         int i = Integer.parseInt(zahl);
         JOptionPane.showMessageDialog(null, binb[i]);
         cliAbfrage();
    */
