package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LaunchApplication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		WebElement logusername = driver.findElement(By.id("username"));
		logusername.sendKeys("demosalesmanager");
		WebElement logpassword = driver.findElement(By.id("password"));
		logpassword.sendKeys("crmsfa");
		WebElement loglogin = driver.findElement(By.className("decorativeSubmit"));
		loglogin.click();
		WebElement crmsfalink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfalink.click();
		WebElement leadslink = driver.findElement(By.linkText("Leads"));
		leadslink.click();
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("xyz");
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("uma");
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("mahesh");
		WebElement birth_date = driver.findElement(By.id("createLeadForm_birthDate"));
		birth_date.sendKeys("08/07/87");
		WebElement area_code = driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		area_code.sendKeys("112233");
		WebElement ph_num = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		ph_num.sendKeys("9876543210");
		WebElement extension = driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
		extension.sendKeys("044");
		WebElement person_to_ask = driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		person_to_ask.sendKeys("mahesh");
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("uma@gmail.com");
		WebElement web_url = driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		web_url.sendKeys("www.xyz.com");
		WebElement to_name = driver.findElement(By.id("createLeadForm_generalToName"));
		to_name.sendKeys("uma");
		WebElement attention_name = driver.findElement(By.id("createLeadForm_generalAttnName"));
		attention_name.sendKeys("uma mahesh waran");
		WebElement address_line_1 = driver.findElement(By.id("createLeadForm_generalAddress1"));
		address_line_1.sendKeys("2/1");
		WebElement address_line_2 = driver.findElement(By.id("createLeadForm_generalAddress2"));
		address_line_2.sendKeys("1st street");
		WebElement city = driver.findElement(By.id("createLeadForm_generalCity"));
		city.sendKeys("chennai");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		state.sendKeys("california");
		WebElement postal_code = driver.findElement(By.id("createLeadForm_generalPostalCode"));
		postal_code.sendKeys("600001");
		WebElement code_extn = driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
		code_extn.sendKeys("123456");
		String get_text_firstname = firstname.getText();
		System.out.println(get_text_firstname);
		WebElement createleadbutton = driver.findElement(By.name("submitButton"));
		createleadbutton.click();
		String get_title_creation_lead = driver.getTitle();
		System.out.println(get_title_creation_lead);		
		
		
		driver.manage().window().minimize();
		////driver.close();
		}

}
