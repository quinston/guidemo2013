/*
Quincy Lam, Ryan Marks, Stephen Wen
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public interface CorrectlyClicked {
	public boolean abc();
}

public class Guidemo2013 implements ActionListener {
	static HashMap<CorrectlyClicked, ButtonListener> panelToButton;
	public static void main(String[] args) {
		HashMap<CorrectlyClicked, ButtonListener> panelToButton = new HashMap<CorrectlyClicked, ButtonListener>();


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

	private static void makeCheckboxListener() {
		f.getContentPane().add(new CheckboxListener());	
		ButtonListener b1 = new ButtonListener("Continue");
		b1.addChangeListener(this);
		f.getContentPane().add(b1);


	}

	private static void makeRadioListener() {
		f.getContentPane().add(new CheckboxListener());	
		ButtonListener b1 = new ButtonListener("Continue");
		b1.addChangeListener(this);
		f.getContentPane().add(b1);
}

		
	// Enables button for CheckboxListener and RadioListener
	public void actionPerformed (ActionEvent e) {
		CorrectlyClicked src = (CorrectlyClicked) e.source;
		if (src.abc()) {
			panelToButton.get(src).setEnabled(true);
		}
	}
	
};
