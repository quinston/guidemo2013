/*
Quincy Lam, Ryan Marks, Stephen Wen
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.*;

public class Guidemo2013 implements ActionListener {
	public static void main(String[] args) {
		JFrame f = new JFrame("Button Checkbox Radio Demo");
		f.getContentPane().add(new CheckboxListener());	
		//ButtonListener b1 = new ButtonListener("Continue");
		//b1.addChangeListener(this);
		//f.getContentPane().add(b1);


		f.getContentPane().add(new CheckboxListener());	
		//ButtonListener b2 = new ButtonListener("Continue");
		//b2.addChangeListener(this);
		//f.getContentPane().add(b2);

		f.pack();
		f.setVisible(true);
	}

	public void actionPerformed (ActionEvent e) {
		
	}
	
};
