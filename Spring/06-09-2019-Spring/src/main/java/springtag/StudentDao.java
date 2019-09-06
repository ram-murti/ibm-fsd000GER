package springtag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createEmployee(Student student)
	{
		System.out.println(student.getFirst_name());
		String query="insert into student(fName,lName,language1) values(?,?,?)";
		Object[] obj= {student.getFirst_name(),student.getLast_name(),student.getFavoriteLanguage()};
		System.out.println(jdbcTemplate);
		jdbcTemplate.update(query,obj);
		System.out.println("done");
	}
	public List<Student> getAllStudentRowMapper(){  
	      List<Student> ls=jdbcTemplate.query("select * from student",new StudentR());
	      for(Student s:ls) {
	    	  System.out.println(s.getFirst_name()+s.getLast_name()+s.getFavoriteLanguage());
	      }
		return ls;
		
		
	}
}
