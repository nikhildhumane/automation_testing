package ORANGEHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_06_ADD_CMPNY_LOCATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHEJAL\\workspace\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		WebElement admin=driver.findElement(By.xpath("//*[@id='admin']/a/span"));
		WebElement cmpnyinfo=driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/a/span"));
		WebElement location=driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/ul/li[2]/a/span"));
		Actions m=new Actions(driver);
		m.moveToElement(admin).build().perform();
		m.moveToElement(cmpnyinfo).build().perform();
		location.click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();
		driver.findElement(By.name("txtLocDescription")).sendKeys("vihan darvekar");
		driver.findElement(By.name("txtState")).sendKeys("maharashra");
		driver.findElement(By.id("cmbDistrict")).sendKeys("nagpur");
		WebElement country=driver.findElement(By.id("cmbCountry"));
		Select i=new Select(country);
		i.selectByIndex(43);   
		driver.findElement(By.id("txtZIP")).sendKeys("444607");
		driver.findElement(By.id("txtAddress")).sendKeys("hingna t  point");
		driver.findElement(By.id("editBtn")).click();
		driver.findElement(By.linkText("Logout")).click();
	}


	}


