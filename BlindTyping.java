import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.TextArea;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Time;
import java.util.Timer;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Scanner;

import javax.swing.UIManager;

public class BlindTyping extends JFrame {

	TextArea textArea = new TextArea();
	
	TextArea textArea_1 = new TextArea();
	 private final JLabel lblTypeHere = new JLabel("Type Here");
         Button button_1 = new Button("Reset");
		 Button button_2 = new Button("Finish");
		  public double marks=0;
		 public String name;
		 public String id;
		 public String email;
		 public String branch;
		 public String mob;
		 Stop stop=new Stop();
	
	public BlindTyping()  {
		
		stop.start();
		getContentPane().setBackground(new Color(65, 105, 225));
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setText(input1);
		
		
	

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,1375,730);
		this.getContentPane().setLayout(null);
		
		
		textArea.setFont(new Font("Arial", Font.PLAIN, 20));
		textArea.setForeground(Color.BLACK);
		textArea.setBounds(46, 103, 1303, 436);
		getContentPane().add(textArea);
		textArea.setBackground(new Color(255, 255, 255));
		
	
		
		textArea_1.setForeground(Color.WHITE);
		
		textArea_1.setFont(new Font("Arial", Font.PLAIN, 1));
		textArea_1.setBackground(new Color(255, 255, 255));
		textArea_1.setBounds(207, 557, 1142, 47);
		getContentPane().add(textArea_1);
		textArea_1.setCursor(null);
	
		JLabel lblBlindtyping = new JLabel("BLIND-TYPING");
		lblBlindtyping.setForeground(Color.RED);
		lblBlindtyping.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 26));
		lblBlindtyping.setBounds(505, 34, 342, 47);
		getContentPane().add(lblBlindtyping);
		lblTypeHere.setForeground(Color.RED);
		lblTypeHere.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		lblTypeHere.setBounds(40, 554, 200, 50);
		
		getContentPane().add(lblTypeHere);
		button_1.setBackground(new Color(240, 230, 140));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_1.setText(" ");
				
			}
		});
		button_1.setFont(new Font("Arial", Font.BOLD, 16));
		button_1.setBounds(472, 630, 88, 22);
		
		getContentPane().add(button_1);
		button_2.setBackground(new Color(240, 230, 140));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fun();
				setVisible(false);
				 Score score=new Score();
				score.setVisible(true);
				score.textField.setText(id);
				score.textField_1.setText(name);
				score.textField_2.setText(email);
				score.textField_3.setText(branch);
				score.textField_4.setText(mob);
				
				score.textField_5.setText(Double.toString(marks));
				try {
					fileWrite();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		button_2.setFont(new Font("Arial", Font.BOLD, 16));
		button_2.setBounds(967, 630, 88, 22);
		
		getContentPane().add(button_2);
		

}              String input1="NASA or National Aeronautics and Space Administration, agency of "
		+ "the United States governmentdeveloping space "
		+ "\nexploration. NASA conducts both human and unpiloted spaceflights,"
		+ "and also trains astronauts and carries out "
		+ "\nin space. NASAs include planetary science, "
		+ "astrophysics, astronomy, Earth science, astrobiology, and aerospace "
		+ "\nmedicine. The agency performance and design of airplanes "
		+ "(aeronautics) and rockets as well. "
		+ "\nNASA is based in Washington, D.C., and is under the guidance of"
		+ "the president of the  The president is mainly  "
		+ "\nfor determining NASAs budget, which directly affects "
		+ "the mission and goals of the agency."
		+ "\nNASA is organized into directorates: the Aeronautics"
		+ "Research Mission Directorate, Exploration Systems Mission ,"
		+ "\nthe Science Mission Directorate, & the Space Operations Mission Directorate."
		+ "NASA employs many engineers, &  "
		+ "\nmajor installations across the country. These facilities include the"
		+ "John F. Kennedy Space Center , Florida; "
		+ "\nthe Lyndon B. Johnson Space Center in Houston, Texas; the Goddard Space "
		+ "Flight Center in Greenbelt, Maryland; the "
		+ "\nFlight Center in Huntsville, Alabama; and the Jet Propulsion Laboratory"
		+ "in Pasadena, California."
		+ "\nScientistsoutside the U.S. government and from "
		+ "other countries commonly work with NASA on particular projects "
		+ "\nspace missions. Satellites launched by NASA are used by"
		+ "the National Oceanic  Administration (NOAA) "
		+ "\nand other government agencies. Although NASA is a civilian agency, "
		+ "it sometimes shares launch facilities ."
		+ "\nNASA replaced the National Advisory Committee"
		+ "for Aeronautics (NACA) that was created by the United"
		+ "\nStates Congress in 1915. NASA absorbed various aviation and"
		+ "space organizations that were already established."
		+"\nBoth nations worked to develop rockets that could "
		+ "carry satellites and piloted missions into space.";
		
		

		
		

			
			

	public void fun()
	{ 
	   
		stop.stopp();
		
		 Long time=stop.getElapsedTimeSecs();
		
	
	String string1="",string2="";
	String input[] = new String[500];
	String userInput[] = new String[500];
       int k=0;
		String bothString=input1;
		String temp=textArea_1.getText();
   	    String text= temp.replaceAll("\n","");
		int length1=bothString.length();
		int length2=text.length();
		
	    int j=0;
		
		for(int i=0;i<length1;i++)
		 {  
			while(j<length2 && i<length1)
			{
			char ch1=bothString.charAt(i);
			char ch2=temp.charAt(j);
			
			if(ch1=='.')
			{     
				j=j+2;
			}
			
			if(ch1==ch2)
			{     
				marks=marks+5;
				j++;
			}
			else
			{     
				marks= marks-0.5;
				j++;
			}
			break;
			}
	}
		
		 if(length1==length2)
			 {  
			 marks=marks+20;
			 }
		
		 for(int i=0;i<length1;i++)
		    {
		    char ch=bothString.charAt(i);
		    if(ch!=' ')
		    {string1=string1+ch;}
		    else 
		    {
		    	input[k]=string1;k++;string1="";}
		    }

		 k=0;
		    for( int i=0;i<length2;i++)
		    { char ch=temp.charAt(i);
		    if(ch!=' ')
		    {string2=string2+ch;}

		    else 
		    {
		      userInput[k]=string2;
		      k++;string2="";}
		    } 
		    
		    for( j=0;j<k;j++)
		    { 
		    if(input[j].equalsIgnoreCase(userInput[j]))
		    {   
		    	marks=marks+10;
		    }
		    else
		    {    
  
		    	marks=marks-1;
		    }
		       

			}
    	 	
    
	}
	public void fileWrite() throws IOException
	{   
		
		//String path="/home/test/Documents/".concat(name).concat(".pdf");
		//FileOutputStream fo = new FileOutputStream(path,true);
		
		
		String path="E:\\".concat(name).concat(".pdf");
		FileOutputStream fo = new FileOutputStream(path,true);
							
				String message = "\n".concat(id).concat("\n").concat(name).concat("\n").concat(email).concat("\n").concat(branch).concat("\n").concat(mob).concat("\n").concat("marks").concat(Double.toString(marks)).concat("\n").concat(textArea_1.getText()).concat("\n");
				fo.write(message.getBytes());
				fo.close();
				
				
		}



	
		
	}
	

