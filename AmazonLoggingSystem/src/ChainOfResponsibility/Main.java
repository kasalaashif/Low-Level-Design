package ChainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		LoggingClass logging = new InfoLogging(new DebugLogging(new ErrorLogging(null)));
		logging.log(LoggingClass.INFO, "Info Message");
		logging.log(LoggingClass.DEBUG, "DEBUG Message");
		logging.log(LoggingClass.ERROR, "ERROR Message");
	}
}
