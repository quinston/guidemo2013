import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.Timer;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
public class GuidemoFrame extends JFrame implements ActionListener {

	private static  HashMap<CorrectlyClicked, JButton> panelToButton;
	private Timer timer;
	private JPanel p;
	public GuidemoFrame() { 
		super("Button Checkbox Radio Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		panelToButton = new HashMap<CorrectlyClicked, JButton>();
		timer = new Timer(100,this); 

		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

		JScrollPane sp = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.add(p);
		add(sp);
}
			
	// Enables button for CheckboxListener and RadioListener
	// Makes a new CheckboxListener or RadioListener for JButtons
	public void actionPerformed (ActionEvent e) {
		CorrectlyClicked src = (CorrectlyClicked) e.getSource();
		if (src.isCorrect()) {
			panelToButton.get(src).setEnabled(true);
		}
		pack();
	}
	
	public void addCheckboxListener() {
		CheckboxListener c = new CheckboxListener();
		/* c.addActionListener( this); */
		p.add(c);	
		JButton b = new JButton("Continue");
		b.addActionListener(new ButtonListener());
		p.add(b);

		p.validate();
		System.out.println(p.getPreferredSize());
		p.setSize(p.getPreferredSize());
		panelToButton.put(c, b);
	}

	public void addRadioListener() {
		RadioListener r = new RadioListener();
		/* c.addActionListener(this); */
		p.add(r);	
		JButton b = new JButton("Continue");
		b.addActionListener(new ButtonListener());
		p.add(b);
		p.validate();
		System.out.println(p.getPreferredSize());
		p.setSize(p.getPreferredSize());
		panelToButton.put(r, b);
	}


}
