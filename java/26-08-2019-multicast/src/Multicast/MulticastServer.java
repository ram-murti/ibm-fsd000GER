package Multicast;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.awt.event.ActionEvent;

public class MulticastServer {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblGettext;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MulticastServer window = new MulticastServer();
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
	public MulticastServer() {
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
		
		textField = new JTextField();
		textField.setBounds(138, 35, 98, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterText = new JLabel("Enter Text");
		lblEnterText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterText.setBounds(21, 35, 98, 17);
		frame.getContentPane().add(lblEnterText);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  // Default port number we are going to use
		        int portnumber = 1236;
		      
		        try {
		        // Create a MulticastSocket
		        MulticastSocket serverMulticastSocket =
		                new MulticastSocket(portnumber);
		        System.out.println("MulticastSocket is created...");
		        
		        // Determine the IP address of a host, given the host name
		        InetAddress group =
		                InetAddress.getByName("224.0.0.1");
		        
		        // getByName- returns IP address of given host
		        serverMulticastSocket.joinGroup(group);
		        System.out.println("joinGroup method is called...");
		        boolean infinite = true;
		        
		        // Continually receives data and prints them 
		       
		            byte buf[] = new byte[1024];
		            DatagramPacket data =
		                    new DatagramPacket(buf, buf.length);
		            serverMulticastSocket.receive(data);
		            String msg =
		                    new String(data.getData()).trim();
		            System.out.println(msg);
		            textField_1.setText(msg);
		          
		            System.out.println("Message received from client = " + msg);
		        
		        serverMulticastSocket.close();
		        }
		        catch(IOException e){
		    		e.printStackTrace();
		    	}
			
		        }
		
		});
		btnNewButton.setBounds(126, 92, 106, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblGettext = new JLabel("getText");
		lblGettext.setBounds(253, 38, 46, 14);
		frame.getContentPane().add(lblGettext);
		
		textField_1 = new JTextField();
		textField_1.setBounds(290, 35, 116, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
			}	
			
}
			
		
	
