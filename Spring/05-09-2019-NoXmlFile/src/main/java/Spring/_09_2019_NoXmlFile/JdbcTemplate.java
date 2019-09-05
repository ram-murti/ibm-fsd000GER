package Spring._09_2019_NoXmlFile;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value="jTemplate")
public class JdbcTemplate extends org.springframework.jdbc.core.JdbcTemplate {

	
	
		@Autowired
		private DataSource dataSource;
		@PostConstruct
	public void setter1(){
		setDataSource(dataSource);
	}
}
