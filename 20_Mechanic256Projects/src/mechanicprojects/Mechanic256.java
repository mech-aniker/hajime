//package de.habelitz.uebung10;
//package Mechanic256Projects;
package mechanicprojects;
/*
 * Programm Artikelliste demonstriert die verwendung einer ArrayList
 * zur Speicherung von Objekten. Es k�nnen beliebig viele Artikel-
 * Objekte gespeichert und nacheinander in einem JLabel angezeigt werden.
 * @author Hans-Peter Habelitz
 * @date 2021-12-29
 */

import java.awt.EventQueue;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
//import javax.swing.JComponent;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mechanic256 extends JFrame {

    private JPanel contentPane;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {preMenu(); backToMain();}

    /**
     * Create the frame. a: \u00E4 u: \u00FC
     */
    public static void preMenu() {
    
        JOptionPane.showMessageDialog(null, "Zu Bewerbungszwecken habe ich in einem Menü ein paar bescheidene Programmier-Übungen in Java zusammengesfasst.\n "
                +  "Weitere Mini-Programme (auch in C/C++) wurden schon programmiert und werden noch hinzugefügt. Weiterentwicklungen sind ebenfalls in Planung. \n "
                , "Mechanic256 Java-Programme", 1);
    

    }
     public static void backToMain() {
        EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Mechanic256 frame = new Mechanic256();
                    frame.add(new JLabel(new ImageIcon("d:/Code/java/eigen/JPanel_bluegrey_24.png")));
		    frame.setVisible(true);
                    
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
        }
    public Mechanic256() {
    	setTitle("Mechanic256 Projects");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 640, 480);
        
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
	
	JLabel lblDescription = new JLabel("Bitte wählen Sie ein Mini-Programm");
	lblDescription.setBounds(10, 11, 180, 14);
	contentPane.add(lblDescription);
	
        
        
	
	JButton btnApp01 = new JButton("Big Pixel");
        btnApp01.setBounds(10, 70, 150, 25);
	contentPane.add(btnApp01);
        
        JLabel lblButton01 = new JLabel("Einfache Anzeige von bunten Kachel ");
	lblButton01.setBounds(180, 75, 250, 15);
	contentPane.add(lblButton01);
        
        JButton btnApp02 = new JButton("CLI");
        btnApp02.setBounds(10, 100, 150, 25);
	//contentPane.add(btnApp02);
        contentPane.add(btnApp02);
        
        JLabel lblButton02 = new JLabel("Ein CLI mit einem Befehl und drei Parametern");
	lblButton02.setBounds(180, 105, 270, 15);
	contentPane.add(lblButton02);
        
        JButton btnApp03 = new JButton("Acronym-Trainer");
        btnApp03.setBounds(10, 130, 150, 25);
	contentPane.add(btnApp03);
        
        JLabel lblButton03 = new JLabel("Abfrage von Akronymen (CompTIA Security+)");
	lblButton03.setBounds(180, 135, 270, 15);
	contentPane.add(lblButton03);
        
        JButton btnApp04 = new JButton("Parcel Service");
        btnApp04.setBounds(10, 160, 150, 25);
	contentPane.add(btnApp04);
        
        JLabel lblButton04 = new JLabel("Berechnung von Paket-Preisen ");
	lblButton04.setBounds(180, 165, 250, 15);
	contentPane.add(lblButton04);
        /*
        JButton btnApp05 = new JButton("IPv6 Check");
        btnApp05.setBounds(10, 190, 150, 25);
	contentPane.add(btnApp05);
        JLabel lblButton05 = new JLabel("Überprüfung von IPv6-Adressen ");
	lblButton05.setBounds(150, 195, 250, 15);
	contentPane.add(lblButton05);
        JButton btnApp06 = new JButton("Polymorphie");
        btnApp06.setBounds(10, 220, 150, 25);
	contentPane.add(btnApp06);
        JLabel lblButton06 = new JLabel("Berechnung mehrerer geometrischer Flächen");
	lblButton06.setBounds(150, 225, 270, 15);
	contentPane.add(lblButton06);
        */
        
        
        
        
	btnApp01.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {rectangleApp();} });
	btnApp02.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {cliApp();} });
	btnApp03.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {voctrainApp();} });
	btnApp04.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {parcelApp();} });
				
		
	JButton btnBack = new JButton("Back");
	btnBack.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		backToMain();
	    }
	});
	btnBack.setBounds(10, 300, 204, 23);
	contentPane.add(btnBack);
	
	JButton btnEnde = new JButton("Ende");
        btnEnde.setBounds(382, 300, 89, 23);
	contentPane.add(btnEnde);
	btnEnde.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    System.exit(0);
		}
	});
	
        }
    
    static void rectangleApp() {Rectangle3 RectObj = new Rectangle3(); RectObj.rectangleM();}
    static void voctrainApp() {Vokabeltrainer VoctrainObj = new Vokabeltrainer(); VoctrainObj.voctrainM();}
    static void cliApp() {Cli CliObj = new Cli(); CliObj.cliM();}
    static void parcelApp() {Parcel ParcelObj = new Parcel(); ParcelObj.parcelM();}
    
}
