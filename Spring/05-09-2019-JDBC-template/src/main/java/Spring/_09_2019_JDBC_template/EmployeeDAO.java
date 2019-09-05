package Spring._09_2019_JDBC_template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class EmployeeDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createEmployee(Employee employee)
	{
		String query="insert into employe(name) values(?)";
		Object obj[]= {employee.getName()};
		jdbcTemplate.update(query,obj);
		System.out.println("done");
	}
	public void viewEmployee() {
		String query="select * from employe";
		jdbcTemplate.execute(query);
	}

}