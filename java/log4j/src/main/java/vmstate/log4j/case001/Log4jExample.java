package vmstate.log4j.case001;

import org.apache.log4j.Logger;

public class Log4jExample 
{
	private static final Logger logger = Logger.getLogger(Log4jExample.class);
	public static void main(String [] args)
	{
		   logger.trace("This is a trace message");
		   
		   logger.info("This is an info message.");
		   
	       logger.debug("This is a debug message.");

	       logger.warn("This is a warning message.");
	       
	       logger.error("An error occurred");

	       logger.fatal("This is a fatal message.");
	       
	}

}
