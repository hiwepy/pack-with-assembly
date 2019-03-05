package main;

import service.FileLogger;

/**
 * 程序主入口
 * 
 * @author mason
 *
 */
public class MainClass {

	public static void main(String[] args) {
		//日志输出到程序根目录(classpath)
		String workDir = FileLogger.class.getResource("/").getPath();
		System.setProperty("WORKDIR", workDir);

		FileLogger logger = new FileLogger();
		logger.logInfo2file();
	}

}
