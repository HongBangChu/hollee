package lee.mink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class WingChunMaster {
	@Autowired
	Forms f;
	
	public WingChunMaster(Forms form) {
		this.f = form;
	}
}
