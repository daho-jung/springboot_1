package mrs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

@Configuration
public class ThymeleafConfig {
	@Bean
	public Java8TimeDialect java8timeDialect() {
		return new Java8TimeDialect();
	}
}
