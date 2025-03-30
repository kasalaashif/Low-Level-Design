package ChainOfResponsibility;

public class DebugLogging extends LoggingClass{

	public DebugLogging(LoggingClass nextLogging) {
		super(nextLogging);
	}
	
	public void log(int logLevel, String message) {
		if(logLevel == LoggingClass.DEBUG) {
			System.out.println("DEBUG: "+ message);
		}
		else {
			super.log(logLevel, message);
		}
	}

}
