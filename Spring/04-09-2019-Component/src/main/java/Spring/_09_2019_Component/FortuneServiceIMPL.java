package Spring._09_2019_Component;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceIMPL implements FortuneService {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is not lucky day";
	}

}
