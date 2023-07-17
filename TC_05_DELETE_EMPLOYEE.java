package ORANGEHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_05_DELETE_EMPLOYEE {

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
		WebElement PIM=driver.findElement(By.xpath("//*[@id='pim']/a/span"));
		WebElement EMPLIST=driver.findElement(By.xpath("//*[@id='pim']/ul/li[1]/a/span"));
		Actions n=new Actions(driver);
		n.moveToElement(PIM).build().perform();
		EMPLIST.click();
		driver.switchTo().frame("rightMenu");
		WebElement drop=driver.findElement(By.id("loc_code")); 
		Select s=new Select(drop);
		s.selectByIndex(1);
		driver.findElement(By.id("loc_name")).sendKeys("0004");
		driver.findElement(By.xpath("//*[@id='standardView']/div[2]/input[2]")).click();
	    driver.findElement(By.name("chkLocID[]")).click();
	    driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[2]")).click();
	    driver.findElement(By.linkText("Logout")).click();
	}

}
