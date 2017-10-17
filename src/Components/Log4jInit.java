package Components;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.*;

public class Log4jInit {

	public static void main(String[] args) throws IOException {
		//初始化log4j对象
		InputStream objInputStream =  Log4j.class.getClassLoader().getResourceAsStream("Components/log4j.properties");
		Properties objProperties = new Properties();
		objProperties.load(objInputStream);
		objInputStream.close();
		//装入log4j配置信息
		PropertyConfigurator.configure(objProperties);

		Logger logger = Logger.getLogger(Log4jInit.class.getName());
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