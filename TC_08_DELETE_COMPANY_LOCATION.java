package ORANGEHRM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_08_DELETE_COMPANY_LOCATION {

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
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/input[3]")).click();
		Alert alt1=driver.switchTo().alert();
		alt1.accept();
		driver.findElement(By.name("chkLocID[]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.findElement(By.linkText("Logout")).click();
	}

}
