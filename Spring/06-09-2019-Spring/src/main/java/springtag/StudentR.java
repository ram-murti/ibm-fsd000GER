package springtag;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentR implements RowMapper<Student> {

	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setFirst_name(rs.getString(2));
		s.setLast_name(rs.getString(3));
		s.setFavoriteLanguage(rs.getString(4));
		return s;
	}
}
