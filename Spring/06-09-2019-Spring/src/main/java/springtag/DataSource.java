package springtag;


import javax.annotation.PostConstruct;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;
@Component
public class DataSource extends BasicDataSource {

	@PostConstruct
	public void setter() {
		setUsername("root");
		setUrl("jdbc:mysql://localhost:3306/mydb");
		setPassword("admin");
		setDriverClassName("com.mysql.jdbc.Driver");
	}

}
