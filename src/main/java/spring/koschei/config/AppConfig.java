package spring.koschei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.koschei.models.Egg6;
import spring.koschei.models.Island2;
import spring.koschei.models.Needle7;
import spring.koschei.models.Wood3;

@Configuration
@ComponentScan(basePackages = "spring.koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Egg6 getEgg(Needle7 needle) {
        return new Egg6(needle);
    }
}