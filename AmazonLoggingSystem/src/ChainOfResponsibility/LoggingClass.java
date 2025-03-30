package ChainOfResponsibility;

public abstract class LoggingClass {
	
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
			

	LoggingClass nextLogging;
	
	public LoggingClass(LoggingClass nextLogging) {
		this.nextLogging = nextLogging;
	}
	
	public void log(int logLevel, String message) {
		if(nextLogging != null) {
			nextLogging.log(logLevel, message);
		}
	}

}
