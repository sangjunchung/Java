package example;

import java.util.logging.Logger;

public class SingletonLogger {
	private static SingletonLogger instance;
	private Logger logger;
	
	private SingletonLogger() {
		logger = Logger.getLogger(SingletonLogger.class.getName());
	}
	
	public static synchronized SingletonLogger getInstance() {
		if (instance == null) {
			instance = new SingletonLogger();
		}
		return instance;
	}
	
	public void logInfo(String msg) {
		logger.info(msg);
	}
}
