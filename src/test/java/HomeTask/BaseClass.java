package HomeTask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
    public static WebDriver driver;
    
    @BeforeMethod
    public void LaunchBrowser() throws Exception {
    	
    	FileInputStream fisprop = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//prop.properties");
    	Properties prop = new Properties();
    	prop.load(fisprop);
    	
    	String Browser = prop.getProperty("Browser");
    	String URL = prop.getProperty("URL");
    	
    	
    	//Check if parameter passed from properties file is chrome
    	if (Browser.equalsIgnoreCase("Chrome")) {
    		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
    		//create chrome instance
    		driver = new ChromeDriver();
    	}
    	
    	//Check if parameter passed from properties file is firefox
    	else if(Browser.equalsIgnoreCase("firefox")){
             System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");	
        //create firefox instance
            driver = new FirefoxDriver();
        }
    	
        //Check if parameter passed from properties file as 'IE'
        else if(Browser.equalsIgnoreCase("ie")){
            //set path to IE.exe
            System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//src//test//resources//iexploredriver.exe");
            //create IE instance
            driver = new InternetExplorerDriver();
        }
    	
        else{
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }
    	
    	
    	driver.get(URL);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    				
    }
    
    @AfterMethod
    public void TearDown() {
    	
    	driver.close();
    }

}
