import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases extends Parameterss {

	String AlreadyGeneratedPassword;

	@BeforeTest
	public void myBeforeTest() {

		driver.get(HomePage);

		System.out.println(AlreadyGeneratedPassword);
	}

//	@Test()
//	public void SIGNUP() {
//		driver.get(SignUpPage);
//		// setup for the sign up process
//		WebElement FirstNameField = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
//		WebElement LastNameField = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
//		WebElement EmailField = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
//		PasswordGenerator myObject = new PasswordGenerator();
//		String Password = myObject.generatePassword();
//		WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
//		WebElement PasswordFieldConfirm = driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]"));
//		WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
//		AlreadyGeneratedPassword = Password;
//
//		// steps to sign up
//		FirstNameField.sendKeys(FirstName);
//		LastNameField.sendKeys(LastName);
//		EmailField.sendKeys(Email_adress);
//		PasswordField.sendKeys(Password);
//		PasswordFieldConfirm.sendKeys(Password);
//		 CreateAccountButton.click();
//
//		System.out.println(AlreadyGeneratedPassword + "test sign up");
//
//	}

	@Test()
	public void SignIn() {

		driver.get(
				"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Email_adress);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(AlreadyGeneratedPassword);
		System.out.println(AlreadyGeneratedPassword + "test sign in");
	}

	@AfterTest
	public void AfterMyTestDone() {
		System.out.println(AlreadyGeneratedPassword + " after Test");
	}

}
