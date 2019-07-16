package TestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import HomeTask.BaseClass;
import PageFactory.LoginPage;
//import junit.framework.Assert;

public class Test_PracticeScenarios extends BaseClass {
	
	@Test
	public static void Test_ValidLogin() throws IOException {
		
		FileInputStream fisprop = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//prop.properties");
    	Properties prop = new Properties();
    	prop.load(fisprop);
    	
    	String Email = prop.getProperty("UserName");
    	String Password = prop.getProperty("Password");
		
    	//LoginPage object creation
		LoginPage login = new LoginPage(driver);
		
		login.Signin_Button(driver);
		login.CreateEmail_Edit(driver, Email);
		login.SubmitEmail_Button(driver);
		login.FirstName_Edit(driver, "Sipra");
		login.LastName_Edit(driver, "M");
		login.CreatePassword_Edit(driver, Password);
		login.CreateAdress_Edit(driver, "Derby");
		login.CreateCity_Edit(driver, "Derby");
		login.CreateState_Edit(driver);
		login.CreatePostalCode_Edit(driver, "12345");
		login.CreateMobilePhone_Edit(driver, "1234567890");
		login.CreateAliasAdress_Edit(driver, "Derby1");
		login.Register_Button(driver);

		String Actual = login.Login_Status(driver);
		 if (Actual.equals("Sipra M")){
	            System.out.println("Account Name is displayed as expected");
	           
	        } 
		 else {
	            System.out.println("Error displayed: Account name is not displayed");
	        }
		
		 
	     login.Dress_Link(driver);
	     login.ClickItem_Link(driver);
	     login.AddToCart_Link(driver);
	     login.ProceedToCheckOut_Link(driver);
	     
        driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		WebElement RowText = driver.findElement(By.xpath("//table[@id='cart_summary']/tbody/tr[1]/td[2]"));
		//capture cart item text value in table
		String tr = RowText.getText();
		

		boolean isFound = tr.contains("demo_3");
		if (isFound = true) {	
			System.out.println("Cart item same as the added item");
		}
		
		else {
			System.out.println("Error: Cart item is not same as the added item");
		}
				

	}   

 }

