package ORANGEHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_09_ADD_COMPANY_STRUCTURE {

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
		WebElement cmpnystruct=driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/ul/li[3]/a/span"));
		Actions m=new Actions(driver);
		m.moveToElement(admin).build().perform();
		m.moveToElement(cmpnyinfo).build().perform();
		cmpnystruct.click();
		driver.findElement(By.linkText("Add")).click();
		driver.findElement(By.name("txtDeptId")).sendKeys("it");
		driver.findElement(By.name("txtTitle")).sendKeys("sehal");
		driver.findElement(By.id("txtDesc")).sendKeys("hfjf");
		WebElement type=driver.findElement(By.xpath("cmbType"));
		Select s=new Select(type);
		s.selectByIndex(1);
		WebElement location=driver.findElement(By.xpath("cmbType"));
		Select s1=new Select(location);
		s1.selectByIndex(2);
		driver.findElement(By.xpath("//*[@id='frmAddNode']/div/input[1]")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
