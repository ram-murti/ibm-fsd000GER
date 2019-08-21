import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JTextField;

public class MyFrame2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame2 window = new MyFrame2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFrame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 434, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(41, 114, 121, -51);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JButton btnUsername = new JButton("username");
		btnUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUsername.setBounds(10, 157, 89, 23);
		frame.getContentPane().add(btnUsername);
		
		textField = new JTextField();
		textField.setBounds(116, 158, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnPassword = new JButton("password");
		btnPassword.setBounds(10, 191, 89, 23);
		frame.getContentPane().add(btnPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 192, 93, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(56, 225, 89, 23);
		frame.getContentPane().add(btnReset);
	}
}
