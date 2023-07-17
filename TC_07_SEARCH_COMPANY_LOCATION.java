package ORANGEHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_07_SEARCH_COMPANY_LOCATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHEJAL\\workspace\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		String exptitle="orange hrm hr activities";
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		if(exptitle.equals(acttitle))
		{
		System.out.println("exp match act");
		}
		else
		{
		System.out.println("exp doesnot match with act");
		}
		WebElement admin=driver.findElement(By.xpath("//*[@id='admin']/a/span"));
		WebElement cmpnyinfo=driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/a/span"));
		WebElement location=driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/ul/li[2]/a/span"));
		Actions m=new Actions(driver);
		m.moveToElement(admin).build().perform();
		m.moveToElement(cmpnyinfo).build().perform();
		location.click();
		driver.switchTo().frame("rightMenu");
		WebElement drop=driver.findElement(By.id("loc_code")); 
		Select s=new Select(drop);
		s.selectByIndex(1);
		driver.findElement(By.id("loc_name")).sendKeys("0002");
		driver.findElement(By.xpath("//*[@id='standardView']/div[2]/input[2]")).click();
		WebElement drop1=driver.findElement(By.id("loc_code")); 
		Select s1=new Select(drop);
		s.selectByIndex(2);
		driver.findElement(By.id("loc_name")).sendKeys("0003");
		driver.findElement(By.xpath("//*[@id='standardView']/div[2]/input[2]")).click();
		WebElement drop2=driver.findElement(By.id("loc_code")); 
		Select s2=new Select(drop);
		s.selectByIndex(3);
		driver.findElement(By.id("loc_name")).sendKeys("0002");
		driver.findElement(By.xpath("//*[@id='standardView']/div[2]/input[2]")).click();
		WebElement drop3=driver.findElement(By.id("loc_code")); 
		Select s3=new Select(drop);
		s.selectByIndex(4);
		driver.findElement(By.id("loc_name")).sendKeys("0001");
		driver.findElement(By.xpath("//*[@id='standardView']/div[2]/input[2]")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
