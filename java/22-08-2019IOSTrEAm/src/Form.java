import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Form {

	private JFrame frmChanam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
					window.frmChanam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChanam = new JFrame();
		frmChanam.setTitle("chanam");
		frmChanam.setBounds(100, 100, 450, 300);
		frmChanam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChanam.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(53, 60, 270, 124);
		frmChanam.getContentPane().add(textArea);
		
		JLabel lblTextArea = new JLabel("Text Area");
		lblTextArea.setBounds(20, 21, 46, 14);
		frmChanam.getContentPane().add(lblTextArea);
		
		JButton btnOut = new JButton("Out");
		btnOut.setBackground(Color.BLUE);
		btnOut.setForeground(Color.CYAN);
		btnOut.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File outputFile=new File("outagain.txt");
				FileOutputStream out;
				try {
					String text=textArea.getText();
					int c = 0;
					out = new FileOutputStream(outputFile);
					for(int i=0;i<text.length();i++) {
						c=text.charAt(i);
						out.write(c);
					}
					out.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
		});
		btnOut.setBounds(152, 211, 89, 23);
		frmChanam.getContentPane().add(btnOut);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(323, 211, -31, 14);
		frmChanam.getContentPane().add(btnNewButton);
		
		JButton btnChuthiya = new JButton("chuthiya");
		btnChuthiya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader in=new FileReader(new File("outagain.txt"));
					int c;
					String text="";
					while((c=in.read())!=-1) {
						text=text+ (char)c;
						textArea.setText(text);
					}
					in.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnChuthiya.setBounds(284, 211, 89, 23);
		frmChanam.getContentPane().add(btnChuthiya);
	}
}
