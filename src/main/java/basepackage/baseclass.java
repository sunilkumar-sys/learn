package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
public static WebDriver driver;
static Properties pro;
public static WebDriver getdriver() throws IOException
{
	pro=new Properties();
	FileInputStream fs=new FileInputStream("C:\\Users\\sk876\\eclipse-workspace\\project\\src\\main\\java\\basepackage\\pro.properties");
	pro.load(fs);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk876\\Desktop\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get(pro.getProperty("url"));
	   System.out.println(pro.get("url"));
	   driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	   return driver;
	   
}
}
