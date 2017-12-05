package Files;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) {
//		try{
//			FileInputStream objInputStream = new FileInputStream("src/Files/Config.properties");
//			Properties objProperties = new Properties();
//			objProperties.load(objInputStream);
//
//			System.out.println("用户代码：" + objProperties.getProperty("User"));
//			System.out.println("密码：" + objProperties.getProperty("Pwd"));
//			
//		}catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}	
		new ReadProperty().ReadConfig();
	}
	
	/**
	 * 相对路径读取配置文件
	 */
	public void ReadConfig()
	{
		try{
			InputStream objInputStream = getClass().getResourceAsStream("/Files/Config.properties");
			Properties objProperties = new Properties();
			objProperties.load(objInputStream);

			System.out.println("用户代码：" + objProperties.getProperty("User"));
			System.out.println("密码：" + objProperties.getProperty("Pwd"));
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}			
	}
}