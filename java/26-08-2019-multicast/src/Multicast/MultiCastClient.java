package Multicast;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.awt.event.ActionEvent;

public class MultiCastClient {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiCastClient window = new MultiCastClient();
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
	public MultiCastClient() {
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

		JLabel lblEnterText = new JLabel("Enter Text");
		lblEnterText.setBounds(42, 40, 69, 14);
		frame.getContentPane().add(lblEnterText);

		textField = new JTextField();
		textField.setBounds(108, 37, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Default port number we are going to use
					int portnumber = 1236;

					// Create a MulticastSocket
					MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);

					// Determine the IP address of a host, given the host name
					InetAddress group = InetAddress.getByName("224.0.0.1");

					// Joins a multicast group
					chatMulticastSocket.joinGroup(group);

					// Prompt a user to enter a message
					String msg = "";
					System.out.println("Type a message for the server:");
					// BufferedReader br =
					// new BufferedReader(new InputStreamReader(System.in));
					// msg = br.readLine();
					
					msg = textField.getText();
					
					// Send the message to Multicast address
					DatagramPacket data = new DatagramPacket(msg.getBytes(), 0, msg.length(), group, portnumber);
					chatMulticastSocket.send(data);
					
					// Close the socket
					chatMulticastSocket.close();
				}

				catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSend.setBounds(105, 92, 89, 23);
		frame.getContentPane().add(btnSend);
	}

}
