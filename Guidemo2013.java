/*
Quincy Lam, Ryan Marks, Stephen Wen
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;



public class Guidemo2013 {
	public static GuidemoFrame f;
	public static void main(String[] args) {


		f = new GuidemoFrame();

		f.addCheckboxListener();
		f.addRadioListener();
		f.setSize(new Dimension(400,400));	
		f.setVisible(true);
	}
		
	
};
