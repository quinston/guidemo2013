import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;
public class CheckboxListener extends JToggleButton{
		private 
		int size;
		JCheckBox boxes[];
	CheckboxListener(){
		size=(int)Math.random()*9+1;
		boxes = new JCheckBox[size];
		
		for (int i=0;i<size;i++){
		
		boxes[i] = new JCheckBox(""+i);
		boxes[i].setMnemonic(KeyEvent.VK_C); 
		boxes[i].setSelected(true);
		
		//boxes[i].addItemListener(this);
		}

	

	}
	
	
	 public void itemStateChanged(ItemEvent e) {
		Object source = e.getItemSelectable();
		
		int box;
	    for (int i=0;i<size;i++){
				//if (box == boxes[i]) {
	    	box=i;
	    	break;//}
	    }
//		if (e.getStateChange() == ItemEvent.DESELECTED)

	}
};