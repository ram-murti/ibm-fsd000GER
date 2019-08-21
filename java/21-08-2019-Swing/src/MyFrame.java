

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	private JLabel label1;
	private JTextField textfield1;
	private JButton button1;
	public MyFrame() throws HeadlessException {
		super();
		label1= new JLabel();
		label1.setText("Enter Your Name");
		textfield1=new JTextField(25);
		button1=new JButton();
		button1.setText("Say Hello");
		this.setTitle("My Frame Demo");
		this.setLayout(new FlowLayout());
		this.setSize(400, 350);
		this.add(button1);
		this.add(label1);
		this.add(textfield1);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		button1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Hello"+textfield1.getText().toString());
		
	}
	
	
}