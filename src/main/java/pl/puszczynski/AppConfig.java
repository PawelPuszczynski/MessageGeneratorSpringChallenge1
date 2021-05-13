package pl.puszczynski;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "pl.puszczynski")
public class AppConfig {

    @Bean
    public MessageGenerator messageGenerator() {
        return new MessageGeneratorImpl();
    }

    @Bean
    public Game game() {
        return new GameImpl();
    }

}
