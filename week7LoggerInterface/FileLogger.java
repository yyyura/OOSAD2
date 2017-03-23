public class FileLogger {

	private static FileLogger logger;

	private FileLogger() {
		// TODO - implement FileLogger.FileLogger
		throw new UnsupportedOperationException();
	}

	public static FileLogger getLogger() {
		return this.logger;
	}

	/**
	 * 
	 * @param msg
	 */
	public synchronized void log(String msg) {
		// TODO - implement FileLogger.log
		throw new UnsupportedOperationException();
	}

}