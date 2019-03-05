package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileLogger
{
	private static Logger logger = LoggerFactory.getLogger(FileLogger.class);

	public void logInfo2file()
	{
		for (int i = 0; i < 100; i++)
		{
			logger.info("我的测试：my test"+i);
		}
	}
}
