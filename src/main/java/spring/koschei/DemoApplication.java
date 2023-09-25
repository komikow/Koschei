package spring.koschei;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(spring.koschei.config.AppConfig.class);
		KoscheiTheDeathless koscheiTheDeathless =
				applicationContext.getBean(KoscheiTheDeathless.class);
		System.out.println(koscheiTheDeathless.getRulesByDeth());
	}
}
