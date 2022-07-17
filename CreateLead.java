package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumCode\\ProjectSelenium\\driver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			//Enter UserName and Password Using Id Locator
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//Click on Login Button using Class Locator
			WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
			loginButton.click();
			Thread.sleep(5000);
			//Click on CRM/SFA Link
			WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
			crmsfaLink.click();
			//Click on Leads Button
			WebElement leadsLink = driver.findElement(By.linkText("Leads"));
			leadsLink.click();
			//Click on Create Lead 
			WebElement createLead = driver.findElement(By.linkText("Create Lead"));
			createLead.click();
			//Enter CompanyName Field Using id Locator
			WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
			companyName.sendKeys("Sysarc");
			//Enter FirstName Field Using id Locator
			WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
			firstName.sendKeys("Arockia Sybil");
            //Enter LastName Field Using id Locator
			WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
			lastname.sendKeys("Perez");
			Thread.sleep(3000);
			//Enter FirstName(Local) Field Using id Locator
			WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
			firstNameLocal.sendKeys("Aro Syb");
			Thread.sleep(3000);
			//Enter Department Field Using any Locator of Your Choice
			WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
			department.sendKeys("QA Department");
			Thread.sleep(3000);
			//Enter Description Field Using any Locator of your choice 
			WebElement description = driver.findElement(By.id("createLeadForm_description"));
			description.sendKeys("text");
			Thread.sleep(3000);
			WebElement emailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
			emailAddress.sendKeys("sybilremigiousperez@gmail.com");
			Thread.sleep(3000);
			//Enter your email in the E-mail address Field using the locator of your choice
			WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Thread.sleep(3000);
			//Select State/Province as NewYork Using Visible Text
			Select select = new Select(stateProvince);
			select.selectByIndex(38);
			Thread.sleep(3000);
			select.selectByValue("NY");
			Thread.sleep(3000);
			select.selectByVisibleText("New York");
			Thread.sleep(3000);
			//Click on Create Button
			WebElement createLeadButton = driver.findElement(By.name("submitButton"));
			createLeadButton.click();
			//Get the Title of Resulting Page. refer the video  using driver.getTitle()
			driver.getTitle();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
	}

}
