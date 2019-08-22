import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import jdbc.Employee;
import jdbc.EmployeeServiceImp;

public class EmployeeS {
	private BufferedReader reader;
	private BufferedWriter writer;
	static String[] str = new String[3];

	public void AddEmployee(String source) throws FileNotFoundException {

		try {
			EmployeeServiceImp s1 = new EmployeeServiceImp();
			reader = new BufferedReader(new FileReader(source));
			String line = reader.readLine();
			while (line != null) {

				str = line.split("\\s");
				System.out.println(str[0] + "" + str[1] + "" + str[2]);
				s1.createEmployee(new Employee(Integer.parseInt(str[0]), str[1], str[2]));
			line = reader.readLine();
			}
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
