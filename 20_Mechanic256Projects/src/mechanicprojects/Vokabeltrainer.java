package mechanicprojects;

import javax.swing.*;
public class Vokabeltrainer
{
  public static void voctrainM() 
  {
      Mechanic256 M256 = new Mechanic256();
     int a = 0;
    // x = (int) (Math.random()*(9+1));
    
                                              
    // JOptionPane.showMessageDialog(null, n);
    JOptionPane.showMessageDialog(null, "Dies ist ein Akronym-Trainer. Sie können eine Anzahl X von Abfragen eingeben. Sie werden daraufhin X-mal Akronyme abgefragt.\n "
               + "\t\tBeispiel: CSR => Certificate Signing Request ) ");
    String anzahl = JOptionPane.showInputDialog("Geben Sie die Anzahl der Abfragen ein");
    if (anzahl == null) {System.out.println("aborted");M256.backToMain();}
    else {
        int y = Integer.parseInt(anzahl);
        while (a<y) 
                { 

                int n = ((int)  (Math.random()*(18 + 2)))*2;
                String voc[]=new String[51];
                voc[0]="CASB";voc[1]="Cloud Access Security Broker";
                voc[2]="CIRT";voc[3]="Computer Incident Response Team";
                voc[4]="COPE";voc[5]="Corporate Owned Personal Enabled";
                voc[6]="CSRF";voc[7]="Cross-Site Request Forgery";
                voc[8]="CVE";voc[9]="Common Vulnerabilities and Exposures";
                voc[10]="CVSS";voc[11]="Common Vulnerability Scoring System";
                voc[12]="CYOD";voc[13]="Choose Your Own Device";
                voc[14]="DAC";voc[15]="Discretionary Access Control";
                voc[16]="DLP";voc[17]="Data Loss Prevention";
                voc[18]="EDR";voc[19]="Endpoint Detection and Response";
                voc[20]="ESP";voc[21]="Encapsulated Security Payload";
                voc[22]="FDE";voc[23]="Full Disk Encryption";
                voc[24]="HIDS";voc[25]="Host-Based Intrusion Detection System";
                voc[26]="HSM";voc[27]="Hardware Security Module";
                voc[28]="IDS";voc[29]="Intrusion Detection System";
                voc[30]="IoC";voc[31]="Indicators of Compromise";
                voc[32]="MAC";voc[33]="Mandatory Access Control";  
                voc[34]="MDM";voc[35]="Mobile Device Management";  
                voc[36]="MOU";voc[37]="Memorandum of Understanding";  
                voc[38]="MSSP";voc[39]="Managed Security Service Provider";  
                voc[40]="MTBF";voc[41]="Mean Time Between Failures";
                voc[42]="MTTF";voc[43]="Mean Time to Failure";
                voc[44]="MTTR";voc[45]="Mean Time to Recover";
                voc[46]="NDA";voc[47]="Non-Disclosure Agreement";
                voc[48]="NIDS";voc[49]="Network-based Intrusion Detection System";
    
                String antwort = JOptionPane.showInputDialog("Akronym: " +voc[n] + "\nAntwort: ");
                
                        
                                if (antwort == null) {a=y;}
                                else if(antwort.equals(voc[n+1]))
                                { JOptionPane.showMessageDialog(null,"Das war richtig!! Sie sind erstaunlich intelligent");a=a+1;}
                                else
                                {
                                JOptionPane.showMessageDialog(null,"Das war leider falsch. Ein Fehler bietet immer die Möglichkeit zur Optimierung !");
                                JOptionPane.showMessageDialog(null,"Das wäre die richtige Antwort gewesen: " + voc[n+1]);
                                a=a+1;
                                }
                                                                   
                               
                }                      
                JOptionPane.showMessageDialog(null,"Die Abfrage ist zu Ende - Beehren Sie uns bald wieder. ");
                System.out.println("aborted"); M256.backToMain();            
                
    }
  }
}   
