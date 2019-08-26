import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import jdbc.Employee;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class NetworkingS {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public Employee empUtil = new Employee();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetworkingS window = new NetworkingS();
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
	public NetworkingS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblEnterNumber = new JLabel("Enter Number");
		lblEnterNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterNumber.setBounds(10, 23, 127, 14);
		frame.getContentPane().add(lblEnterNumber);

		textField = new JTextField();
		textField.setBounds(123, 23, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				Socket client = null;

				// Default port number we are going to use
				int portnumber = 1234;

				try {
					String msg = "";

					// Create a client socket

					client = new Socket(InetAddress.getLocalHost(), portnumber);
					System.out.println("Client socket is created " + client);

					// Create an output stream of the client socket
					OutputStream clientOut = client.getOutputStream();
					PrintWriter pw = new PrintWriter(clientOut, true);

					// Create an input stream of the client socket
					InputStream clientIn = client.getInputStream();
					BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));

					// System.out.println("Enter your name. Type Bye to exit. ");

					// Read data from standard input device and write it
					// to the output stream of the client socket.

					pw.println(textField_1.getText());
					pw.println(textField_3.getText());
					// Read data from the input stream of the client socket.
					// System.out.println("Message returned from the server = " + br.readLine());
					String line = br.readLine();

					textField_1.setText(line);
					//textField_2.setText(br.readLine());
                    
					
					try {
						String rawString= br.readLine();
						Employee emp = empUtil.getObject(rawString);
						System.out.println(emp);
						textField_2.setText(emp.getId()+" "+emp.getFname()+" "+emp.getLname());
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    
                    
                     //textField_2.setText(emp.getId()+emp.getFname()+emp.getLname());
                     
					pw.close();
					br.close();
					client.close();

					// Stop the operation

				} catch (IOException ie) {
					ie.printStackTrace();
					//System.out.println("I/O error - Start server and turn off Firewall" + ie);
				}
			}

		});
		btnSubmit.setBounds(98, 64, 89, 23);
		frame.getContentPane().add(btnSubmit);

		textField_1 = new JTextField();
		textField_1.setBounds(269, 65, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(213, 68, 46, 14);
		frame.getContentPane().add(lblResult);

		textField_2 = new JTextField();
		textField_2.setBounds(89, 127, 219, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(300, 23, 68, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblSearchbyyid = new JLabel("SearchByyId");
		lblSearchbyyid.setBounds(234, 26, 46, 14);
		frame.getContentPane().add(lblSearchbyyid);
	}
}
