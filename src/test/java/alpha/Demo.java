package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Demo {

    private static Logger logger = LogManager.getLogger(Demo.class.getName());
    @Test
    public void demo(){
        logger.warn("this is a warn");
        logger.debug("this is a debug");
        logger.error("this is an error");

    }
}
