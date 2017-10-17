package Components;

import java.io.IOException;

import org.apache.log4j.*;

public class Log4j {
	
	public static void main(String[] args) throws IOException {
		//需要将log4j.properties文件复制到生成的根目录中
		org.apache.log4j.Logger logger = Logger .getLogger(Log4j.class);
		logger.setLevel(Level.WARN);
		try {
			//按照不同级别写入日志g
			logger.info("Info信息");
			logger.debug("debug信息");
            logger.trace("trace信息");
            logger.warn("warn信息");
            logger.error("Error信息");
            logger.fatal("fatal信息");
		} catch (IllegalArgumentException ex) {
			//异常信息写入
			logger.error(ex.getMessage());
		}
	}
}