package services;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class PagilaLogger {
	private static final Logger log = Logger.getLogger(PagilaLogger.class);
	private static final PagilaLogger INSTANCE = new PagilaLogger();

	private PagilaLogger() {
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.ALL);

		// Define log pattern layout
		PatternLayout layout = new PatternLayout("%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p %l - %m%n");

		// Add console appender to root logger
		rootLogger.addAppender(new ConsoleAppender(layout));

		// Lets verify the log messages
		log.info("Welcome to www.HowToDoInJava.com this is used to log information");
		log.debug("Welcome to www.HowToDoInJava.com this is used to log debugging");
		log.error("Welcome to www.HowToDoInJava.com this is used to log errors");
		log.fatal("Welcome to www.HowToDoInJava.com this is used to log errors");
	}

	public static PagilaLogger getInstance() {
		return INSTANCE;
	}

}
