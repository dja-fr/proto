package fr.dja.util;

import org.apache.log4j.Logger;

public class LogUtil {
	private final static Logger LOGGER = Logger.getLogger(LogUtil.class);


	public static void generateLogs() {
		LOGGER.debug("Debug Log");
		LOGGER.info("Info Log");
		LOGGER.warn("Warn Log");
		LOGGER.error("Error Log");
		LOGGER.fatal("Fatal Log");

	}
}
