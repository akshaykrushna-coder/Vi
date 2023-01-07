package Banking.sbi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println("hello");
        logger.info("iformation");
        logger.error("error");
        System.out.println("new line");
        System.out.println("second line");
        System.out.println("next line");
        System.out.println("third line");
       System.out.println("branch comment");
       
    }
}
