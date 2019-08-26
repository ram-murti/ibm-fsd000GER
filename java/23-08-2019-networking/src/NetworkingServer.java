
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
/* SERVER � may enhance to work for multiple clients */
import java.net.ServerSocket;
import java.net.Socket;

import jdbc.Employee;
import jdbc.EmployeeServiceImp;

public class NetworkingServer {
	Employee s = new Employee();

	public static void main(String[] args) {
		String[] msgFromClient = new String[2];
		;
		ServerSocket server = null;
		Socket client;

		// Default port number we are going to use
		int portnumber = 1234;

		// Create Server side socket
		try {
			server = new ServerSocket(portnumber);
		} catch (IOException ie) {
			System.out.println("Cannot open socket." + ie);
			System.exit(1);
		}
		System.out.println("ServerSocket is created " + server);

		// Wait for the data from the client and reply
		while (true) {

			try {

				// Listens for a connection to be made to
				// this socket and accepts it. The method blocks until
				// a connection is made
				System.out.println("Waiting for connect request...");
				client = server.accept();

				System.out.println("Connect request is accepted...");
				String clientHost = client.getInetAddress().getHostAddress();
				int clientPort = client.getPort();
				System.out.println("Client host = " + clientHost + " Client port = " + clientPort);
				EmployeeServiceImp s1 = new EmployeeServiceImp();
				// Read data from the client
				InputStream clientIn = client.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
				

				String line = br.readLine();

				System.out.println(line);
				msgFromClient[0] = line;
				System.out.println("Message received from client = " + msgFromClient[0]);
				line = br.readLine();
				msgFromClient[1] = line;
				
				int fact = 1;
				
				OutputStream clientOut = client.getOutputStream();
				PrintWriter pw = new PrintWriter(clientOut, true);
				String ansMsg = "Hello, " + fact;
				pw.println(ansMsg);
				Employee s2 = s1.getEmployeeById(Integer.parseInt(msgFromClient[1]));
				//System.out.println(s2.getId() + " " + s2.getFname() + " " + s2.getLname());
				//pw.println(s2.getId() + " " + s2.getFname() + " " + s2.getLname());
				System.out.println("hi");
				//String stringtemp = s2.toString();
				//s2 = s2.getObject(stringtemp);
				//System.out.println(s2.getFname());
				pw.println(s2);
				// Send response to the client

				// Close sockets
				if (msgFromClient[0] != null && msgFromClient[0].equalsIgnoreCase("bye")) {
					server.close();
					client.close();
					break;
				}

			} catch (Exception ie) {
				ie.printStackTrace();
			}
		}
		
		}
	public int fact2(int a) {
	int	fact1=1;
		for(int i=a;i>0;i--) {
			fact1=fact1*i;
		}
		return fact1;
		
	}
	}
