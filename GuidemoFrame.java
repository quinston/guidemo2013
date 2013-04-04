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
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;
import java.util.Map.Entry;
import java.util.Iterator;
public class GuidemoFrame extends JFrame implements ActionListener,WindowStateListener {

	private static  HashMap<CorrectlyClicked, JButton> panelToButton;
	private Timer timer;
	private JPanel p;
	private JScrollPane sp;
	public GuidemoFrame() { 
		super("Button Checkbox Radio Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		panelToButton = new HashMap<CorrectlyClicked, JButton>();
		timer = new Timer(100,this); 
		timer.start();

		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));

		sp = new JScrollPane(p);
		sp.validate();
		add(sp);
		validate();
}
			
	// Enables button for CheckboxListener and RadioListener
	// Makes a new CheckboxListener or RadioListener for JButtons
	public void actionPerformed (ActionEvent e) {
		for (Iterator<Entry<CorrectlyClicked,JButton>> i = panelToButton.entrySet().iterator(); i.hasNext(); ) {
			Entry<CorrectlyClicked,JButton> m = i.next();
			m.getValue().setEnabled(m.getKey().isCorrect());
		} 
		p.setSize(p.getPreferredSize());
	}

	public void windowStateChanged(WindowEvent e) {
	
	}
	
	public void addCheckboxListener() {
		CheckboxListener c = new CheckboxListener();
		/* c.addActionListener( this); */
		p.add(c);	
		JButton b = new JButton("Continue");
		b.addActionListener(new ButtonListener());
		b.setEnabled(false);
		p.add(b);

		System.out.println(p.getPreferredSize());
		p.setSize(p.getPreferredSize());
		p.validate();
		panelToButton.put(c, b);
	}

	public void addRadioListener() {
		RadioListener r = new RadioListener();
		/* c.addActionListener(this); */
		p.add(r);	
		JButton b = new JButton("Continue");
		b.addActionListener(new ButtonListener());
		b.setEnabled(false);
		p.add(b);

		System.out.println(p.getPreferredSize());
		p.setSize(p.getPreferredSize());

		p.validate();
		panelToButton.put(r, b);
	}


}
