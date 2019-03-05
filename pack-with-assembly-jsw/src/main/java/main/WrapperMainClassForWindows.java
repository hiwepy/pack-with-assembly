package main;

import service.FileLogger;

/**
 * wrapper服务运行入口类
 * 
 * @author mason
 *
 */
public class WrapperMainClassForWindows {
	public static void main(String[] args) {
		//日志输出到程序根目录(classpath)
		String workDir = FileLogger.class.getResource("/").getPath();
		System.setProperty("WORKDIR", workDir);

		FileLogger logger = new FileLogger();
		logger.logInfo2file();
	}
}
