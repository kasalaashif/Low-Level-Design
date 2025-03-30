package ChainOfResponsibility;

public class ErrorLogging extends LoggingClass{

	public ErrorLogging(LoggingClass nextLogging) {
		super(nextLogging);
	}
	
	public void log(int logLevel, String message) {
		if(logLevel == LoggingClass.ERROR) {
			System.out.println("ERROR: "+ message);
		}
		else {
			super.log(logLevel, message);
		}
	}

}
