package pl.puszczynski;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MessageGenerator messageGenerator1 = context.getBean(MessageGeneratorImpl.class);

        System.out.println(messageGenerator1.getMainMessage());
        System.out.println(messageGenerator1.getResultMessage());

        logger.info("messageGenerator = {}", messageGenerator1.getMainMessage());
        logger.info("messageGenerator = {}", messageGenerator1.getResultMessage());

    }


}
