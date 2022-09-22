package executionpart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readconfig {
	public static 	FileInputStream fis=null;
	public static 	Properties prop=null;
	readconfig() {
		 try {
		
			 fis =new FileInputStream("D:\\New folder\\HYBRIDFRAMEWORK\\configurations\\config.properties");
			 prop=new Properties();
			 prop.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
	public String geturl() {
		String url=prop.getProperty("url");
		
	return url;
	}
	public String getusername() {
		String username=prop.getProperty("username");
		
	return username;}
	
	public String getpassword() {
		String password=prop.getProperty("password");
		
	return password;}
	public String getiepath() {
		String ie=prop.getProperty("iepath");
		return ie;
	}
	public String getfirefoxpath() {
		String firepath=prop.getProperty("firefoxpath");
		return firepath;

	}
	public String getdesiredbrowser() {
		String browsername=prop.getProperty("browser");
		return browsername;

	}
	public String getchropath() {
		String browsername=prop.getProperty("chromepath");
		return browsername;

	}
}
