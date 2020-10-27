package lee.mink;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SiuNimTau implements Forms {

	@Override
	public void doForm() {
		System.out.println("do Siu Nim Tau");
	}

}
