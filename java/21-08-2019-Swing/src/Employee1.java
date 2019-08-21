

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import jdbc.Employee;
import jdbc.EmployeeService;
import jdbc.EmployeeServiceImp;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Employee1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnGetelementbyid;
	private JLabel label;
	private JTextField textField_3;
	private JButton btnDeletebyid;
	private JTextField textField_4;
	private JButton btnNewloadButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee1 window = new Employee1();
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
	public Employee1() {
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
		
		JLabel lblId = new JLabel("id");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblId.setBounds(10, 30, 46, 14);
		frame.getContentPane().add(lblId);
		
		textField = new JTextField();
		textField.setBounds(62, 27, 69, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFname = new JLabel("fname");
		lblFname.setBounds(0, 55, 46, 14);
		frame.getContentPane().add(lblFname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(72, 58, 98, 14);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLname = new JLabel("lname");
		lblLname.setBounds(0, 80, 46, 14);
		frame.getContentPane().add(lblLname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(45, 77, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAddEmployee = new JButton("Add employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EmployeeService service=new EmployeeServiceImp();
					service.createEmployee(new Employee(Integer.parseInt(textField.getText().toString()),textField_1.getText() ,textField_2.getText()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddEmployee.setBounds(81, 116, 89, 23);
		frame.getContentPane().add(btnAddEmployee);
		
		btnGetelementbyid = new JButton("getelementbyid");
		btnGetelementbyid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					EmployeeService service=new EmployeeServiceImp();
					Employee obj = service.getEmployeeById(Integer.parseInt(textField_3.getText().toString()));
					textField.setText(""+obj.getId()+"");
					textField_1.setText(obj.getFname());
					textField_2.setText(obj.getLname());
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnGetelementbyid.setBounds(185, 116, 89, 23);
		frame.getContentPane().add(btnGetelementbyid);
		
		label = new JLabel("");
		label.setBounds(284, 120, 46, 14);
		frame.getContentPane().add(label);
		
		textField_3 = new JTextField();
		textField_3.setBounds(281, 117, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		btnDeletebyid = new JButton("Deletebyid");
		btnDeletebyid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EmployeeService service;
				try {
					service = new EmployeeServiceImp();
					service.DeleteEmployByID(Integer.parseInt(textField_4.getText().toString()));
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		});
		btnDeletebyid.setBounds(185, 150, 89, 23);
		frame.getContentPane().add(btnDeletebyid);
		
		textField_4 = new JTextField();
		textField_4.setBounds(281, 151, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		btnNewloadButton = new JButton("Newload button");
		btnNewloadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new MyTable();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewloadButton.setBounds(185, 197, 89, 23);
		frame.getContentPane().add(btnNewloadButton);
	}
}
