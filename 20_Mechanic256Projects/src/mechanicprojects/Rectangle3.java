package mechanicprojects;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Rectangle3 
{
  public static void rectangleM() 
  {
    Mechanic256 M256 = new Mechanic256();  
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(550, 30, 455, 505);
    
    JButton btnApp01 = new JButton("Back to Main");
    btnApp01.setBounds(10, 435, 120, 25);
    window.add(btnApp01);
    

    window.getContentPane().add(new MyCanvas());
    
   
    JOptionPane.showMessageDialog(null, "Vorsicht! Diese App bildet einfach nur bunte Kacheln ab, die schön anzusehen sind...\n "
                +  " Vielleicht möchten Sie sich schon einmal auf ein Gefühl leichter Enttäuschng einstellen? :)\n ");
    
    window.setVisible(true);
    btnApp01.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {M256.backToMain();window.setVisible(false);} });

    /*
    integer = JOptionPane.showOptionDialog(null, "Und hier nun ein paar Optionen", "Back to the mechanics",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE, null, 
                new String[]{"Option0", "Option1", "Back to Main", "Option3"}, "B"); // Option0 => integer =0 /
     
    
    if (integer == 0)
    {
    JOptionPane.showMessageDialog(null, "Vorsicht! Diese App bildet einfach nur bunte Kacheln ab, die ganz schön anzusehen sind...\n "
                + integer +  " Vielleicht möchten Sie sich schon einmal auf ein Gefühl leichter Enttäuschng einstellen. :)\n ");
    window.setVisible(true);
    }
    
    else if (integer == 2)
    {M256.backToMain();}
    
    else {window.setVisible(true);}
    */
  }
}

class MyCanvas extends JComponent 
{

  Color[][] palettes = 
  {
    {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW},
    {Color.CYAN, Color.MAGENTA, Color.ORANGE, Color.PINK}
  }; // statt zwei Arrays habe ich ein Array mit Arrays gemacht

  private int currentPaletteIndex = 0; // current Palleteindex (quasi die Nummer von Array in Array palettes) 
  private int currentColorIndex = 0; // die Nummer von Element in palette. Quasi Parameter f, der war bei dir fruerer

  Graphics currentGraphics; // Deklarieren eine Variable mit Typ Graphics um spaeter aus Methode paint() hier Objekt g speichern. 
                            //Das wurde dafuer gemacht, dass in der Methode drawRect Graphics Objekt zu benutzen. 
                            //Kann man das nicht machen, aber dann muss man Objekt g aus Methode paint() als Parameter in die Methode drawRect() uebergeben beim Aufrufen.
                            

  public void paint(Graphics g) {
    this.currentGraphics = g; // Speichern current Graphics Objekt in unsere Eigenshaft vom Objekt MyCanvas

    //Color myWhite = new Color(255, 255, 255);
    for (int x=10; x<=388; x+=42) {
      for (int y=10; y<=388; y+=42) { 
        drawRect(palettes[currentPaletteIndex][currentColorIndex], x, y); // Aufrufen der Methode zum Zeichnen eines Rechtecks mit current Farbe (wurde mit currentColorIndex bei Objekt MyCanvas eingestellt)
        setNextColorIndex(); // Wechseln einer Farbe zur naechsten
      }
      setNextPalette(); // wechseln de Palette bei jeder neuen Spalte
    }  
  } 

  /* Zeichnen des Rechtecks mit einer bestimmten Farbe und Position */
  private void drawRect(Color color, int positionX, int positionY) 
  {
    int width = 40;
    int height = 40;
    currentGraphics.setColor(color);
    currentGraphics.fillRect(positionX, positionY, width, height);
  }

  // Wechseln des Farbenindex in der Palette
  private void setNextColorIndex() 
  {
    if(this.currentColorIndex >= this.palettes[currentPaletteIndex].length - 1) {this.currentColorIndex = 0;}
    else {this.currentColorIndex++;}
  }

  // Wechseln des Palettenindex
  public void setNextPalette() 
  {
    if(this.currentPaletteIndex >= this.palettes.length - 1) {this.currentPaletteIndex = 0;}
    else {this.currentPaletteIndex++;}
    this.currentColorIndex = 0;    
  }
}

/* Anmerkungen
16: x-Feldkoordinaten: 10,52,94...(430-42=388)
17: y-Feldkoordinaten: "....
*/
