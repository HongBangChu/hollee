package lee.mink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HolleeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HolleeApplication.class, args);
		Forms f = context.getBean(Forms.class);
		System.out.println(f);
		f.doForm();
		
		WingChunMaster w = context.getBean(WingChunMaster.class);
		System.out.println(w);
		System.out.println(w.f);
		w.f.doForm();
	}

}
