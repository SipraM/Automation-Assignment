package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	WebElement SignIn;
	
	@FindBy(xpath = "//input[@name='email_create']")
	WebElement CreateEmail;
	
	@FindBy(xpath = "//button[@name='SubmitCreate']")
	WebElement SubmitEmail;
	
	@FindBy(xpath = "//input[@name='customer_firstname']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@name='customer_lastname']")
	WebElement LastName;
	
	@FindBy(xpath = "//input[@name='passwd']")
	WebElement CreatePassword;
	
	@FindBy(xpath = "//input[@name='address1']")
	WebElement CreateAdress;
	
	@FindBy(xpath = "//input[@name='city']")
	WebElement CreateCity;
	
	@FindBy(xpath = "//input[@name='postcode']")
	WebElement PostCode;
	
	@FindBy(xpath = "//input[@name='phone_mobile']")
	WebElement MobilePhone;
	
	@FindBy(xpath = "//input[@name='alias']")
	WebElement AliasAdress;
	
	@FindBy(xpath = "//button[@name='submitAccount']")
	WebElement Register;
	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement UserNameEdit;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement PasswordEdit;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement LoginButton;
	
	@FindBy(xpath="//a[@title='View my customer account']")
	WebElement ValidateAccount;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement Dress;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div")
	WebElement ClickItem;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement AddToCart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	WebElement ProceedToCheckOut;
	
	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement ViewMyShoppingCart;
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	//This method will be used to wait for the object visibilty in the application within a fixed time
	public void WaitForObject(WebDriver driver, WebElement element )
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	//This method will be used for to create an new email for the application
	public void CreateEmail_Edit(WebDriver driver, String Email)
	{
		WaitForObject(driver, CreateEmail);
		if (CreateEmail.isDisplayed()){
			System.out.println("Create Email field is displayed");
			CreateEmail.sendKeys(Email);
		}
		
		else 
			System.out.println("Error:-Create Email field is not displayed");
	}
	
	
	
	//This method will be used for submitting the new email 
	public void SubmitEmail_Button(WebDriver driver)
	{
		WaitForObject(driver, SubmitEmail);
		SubmitEmail.click();
	}
	
	
	
	//This method will be used to put the value in first name field
	public void FirstName_Edit(WebDriver driver, String FName)
	{
		WaitForObject(driver, FirstName);
		if (FirstName.isDisplayed()){
			System.out.println("First Name field is displayed");
			FirstName.sendKeys(FName);
		}
		
		else 
			System.out.println("Error:-First Name field is not displayed");
	}
	
	
		
	//This method will be used to put the value in last name field in create account page
	public void LastName_Edit(WebDriver driver, String LName)
	{
		WaitForObject(driver, LastName);
		if (LastName.isDisplayed()){
			System.out.println("Last Name field is displayed");
			LastName.sendKeys(LName);
		}
		
		else 
			System.out.println("Error:-Last Name field is not displayed");
	}	
	
	
	
	//This method will be used to put the value in password field in create account page
	public void CreatePassword_Edit(WebDriver driver, String Password)
	{
		WaitForObject(driver, CreatePassword);
		if (CreatePassword.isDisplayed()){
			System.out.println("Create New password field is displayed");
			CreatePassword.sendKeys(Password);
		}
		
		else 
			System.out.println("Error:- Create New password field is not displayed");
	}	
	
	
	
	//This method will be used to put the value in address field in create account page
	public void CreateAdress_Edit(WebDriver driver, String Adress)
	{
		WaitForObject(driver, CreateAdress);
		if (CreateAdress.isDisplayed()){
			System.out.println("Adress field is displayed in create account page");
			CreateAdress.sendKeys(Adress);
		}
		
		else 
			System.out.println("Error:- Adress field is not displayed");
	}	
	
	
		
	//This method will be used to put value in city field in create account page
	public void CreateCity_Edit(WebDriver driver, String City)
	{
		WaitForObject(driver, CreateCity);
		if (CreateCity.isDisplayed()){
			System.out.println("City field is displayed in create account page");
			CreateCity.sendKeys(City);
		}
		
		else 
			System.out.println("Error:- City field is not displayed");
	}	
	
	
	public void CreatePostalCode_Edit(WebDriver driver, String postalCode)
	{
		WaitForObject(driver, PostCode);
		if (PostCode.isDisplayed()){
			System.out.println("postal code field is displayed in create account page");
			PostCode.sendKeys(postalCode);
		}
		
		else 
			System.out.println("Error:- postal code field is not displayed");
	}
	
	
	
	
	public void CreateMobilePhone_Edit(WebDriver driver, String mobilePhone)
	{
		WaitForObject(driver, MobilePhone);
		if (MobilePhone.isDisplayed()){
			System.out.println("Mobile Phone field is displayed in create account page");
			MobilePhone.sendKeys(mobilePhone);
		}
		
		else 
			System.out.println("Error:- Mobile Phone field is not displayed");
	}	
	
	
	
	public void CreateAliasAdress_Edit(WebDriver driver, String mobilePhone)
	{
		WaitForObject(driver, AliasAdress);
		if (AliasAdress.isDisplayed()){
			System.out.println("alias reference field is displayed in create account page");
			AliasAdress.sendKeys(mobilePhone);
		}
		
		else 
			System.out.println("Error:- alias reference field is not displayed");
	}	
	
	
	
	//This method for clicking the Register  button
		public void Register_Button(WebDriver driver)
		{
			WaitForObject(driver, Register);
			Register.click();
		}
		
		
	
	//This method will be used to put the email address in already registered field
	public void Username_Edit(WebDriver driver, String Username)
	{
		WaitForObject(driver, UserNameEdit);
		UserNameEdit.sendKeys(Username);
	}
	
	
	
	//This method will be used to put the password in already registered field
	public void Password_Edit(WebDriver driver, String Password)
	{
		WaitForObject(driver, PasswordEdit);
		if (PasswordEdit.isDisplayed()){
			System.out.println("Password field is displayed");
		   PasswordEdit.sendKeys(Password);
		}
		
		else 
			System.out.println("Error:-Password field is not displayed");
	}
	
	
	
	//This method for clicking the sign in button
	public void Signin_Button(WebDriver driver)
	{
		WaitForObject(driver, SignIn);
		SignIn.click();
	}
	
	
	
	//This method for clicking the signin button in already registered field
	public void Login_Button(WebDriver driver)
	{
		WaitForObject(driver, LoginButton);
		LoginButton.click();
	}
	
	
	
	//This method will be used for capturing the login status from the application
	public String Login_Status(WebDriver driver)
	{
		WaitForObject(driver, ValidateAccount);
		return (ValidateAccount.getText().trim());
	}
	
	
	
	
	public void CreateState_Edit(WebDriver driver)
	{

	Select oSelect = new Select(driver.findElement(By.id("id_state")));
	
	oSelect.selectByIndex(1);
	
	}	
	
	
	public void Dress_Link(WebDriver driver)
	{
		WaitForObject(driver, Dress);
		Dress.click();
	}
	
	
	public void ClickItem_Link(WebDriver driver)
	{
		WaitForObject(driver, ClickItem);
		ClickItem.click();
	}
	
	
	
	public void AddToCart_Link(WebDriver driver)
	{
		WaitForObject(driver, AddToCart);
		AddToCart.click();
	}
	
	
	
	public void ProceedToCheckOut_Link(WebDriver driver)
	{
		WaitForObject(driver, ProceedToCheckOut);
		ProceedToCheckOut.click();
	}
	
	
	
	public void ViewMyShoppingCart_Link(WebDriver driver)
	{
		WaitForObject(driver, ViewMyShoppingCart);
		ViewMyShoppingCart.click();
	}

}
