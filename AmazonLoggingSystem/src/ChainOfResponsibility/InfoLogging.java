package ChainOfResponsibility;

public class InfoLogging extends LoggingClass{

	public InfoLogging(LoggingClass nextLogging) {
		super(nextLogging);
	}
	
	public void log(int logLevel, String message) {
		if(logLevel == LoggingClass.INFO) {
			System.out.println("INFO: "+ message);
		}
		else {
			super.log(logLevel, message);
		}
	}

}
