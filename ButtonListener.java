import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonListener implements ActionListener {
	public ButtonListener() {

	}
	public void actionPerformed(ActionEvent e) {
		if (Math.random() * 3 < 1) {
			Guidemo2013.f.addRadioListener();
		}
		else {
			Guidemo2013.f.addCheckboxListener();
		}
	}	
};
