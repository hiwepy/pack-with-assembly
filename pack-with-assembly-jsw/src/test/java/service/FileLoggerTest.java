package service;

import org.junit.Test;

public class FileLoggerTest
{

	@Test
	public void testLogInfo2file()
	{
		FileLogger logger = new FileLogger();
		logger.logInfo2file();
	}

}
