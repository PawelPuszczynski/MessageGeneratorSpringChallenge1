package pl.puszczynski;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    private static final Logger logger = LoggerFactory.getLogger(MessageGenerator.class);

    @Autowired
    private Game game;

    private int guessCount = 10;


    @PostConstruct
    public void testInit() {
        logger.debug("game = {}", game);
    }

    @Override
    public String getMainMessage() {
        return "getMainMessage() called...";
    }

    @Override
    public String getResultMessage() {
        return "getResultMessage() called...";
    }


}
