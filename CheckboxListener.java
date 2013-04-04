import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;
public class CheckboxListener extends JPanel implements ItemListener, CorrectlyClicked{
		private 
		int toCheck, size;
		private JCheckBox boxes[];
		private JLabel upperText;
	public CheckboxListener(){
		super();
		setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));


		size=(int)Math.random()*9+1;
		toCheck = (int)Math.random()*size + 1;
		add(upperText = new JLabel("Tick "+toCheck+" boxes."));
		boxes = new JCheckBox[size];
		
		for (int i=0;i<size;i++){
		
		boxes[i] = new JCheckBox(""+i);
		boxes[i].setSelected(false);
		add(boxes[i]);
		//boxes[i].addItemListener(this);
		}

		validate();	

	}
	
	
	 public void itemStateChanged(ItemEvent e) {
		int numberChecked=0;
		for (int i=0;i<size;i++){
	    		if (boxes[i].isSelected()) {
				++numberChecked;
			}
		}
		if (numberChecked > toCheck) {
			upperText.setText((numberChecked - toCheck) + " fewer!" );
		}
		else {
			upperText.setText((toCheck - numberChecked) + " more.");
		}
	}

	public boolean isCorrect() {
		int numberChecked=0;
		for (int i=0;i<size;i++){
	    		if (boxes[i].isSelected()) {
				++numberChecked;
			}
		}
		return numberChecked == toCheck;
	}

	
};
