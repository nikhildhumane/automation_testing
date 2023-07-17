package ORANGEHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_02_VERIFY_EMPLOYEE_LEAVE_SUMMARY {

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
		System.out.println(driver.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText());
WebElement leave=driver.findElement(By.xpath("//*[@id='leave']/a/span"));
WebElement leavesummary=driver.findElement(By.xpath("//*[@id='leave']/ul/li[1]/a/span"));
WebElement empleavesummary=driver.findElement(By.xpath("//*[@id='leave']/ul/li[1]/ul/li/a/span"));
Actions n=new Actions(driver);
n.moveToElement(leave).build().perform();
n.moveToElement(leavesummary).build().perform();
empleavesummary.click();
driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
	}
	}

