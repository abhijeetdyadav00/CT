package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class W3Schools {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement exercise=driver.findElement(By.xpath("(//a[text()='Exercises '])[1]"));
		
		exercise.click();
		
		WebElement html=driver.findElement(By.xpath("//a[text()='HTML Exercises']"));
		html.click();
		
		WebElement iframe=driver.findElement(By.xpath("//a[text()='HTML Iframes']"));
		iframe.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@title='W3Schools HTML Tutorial']"));
		try {
		driver.close();}
		finally
		{driver.switchTo().frame(4);}
		
//		Thread.sleep(3000);
//		
//		WebElement javascript=driver.findElement(By.xpath("(//a[text()='JAVASCRIPT'])[2]"));
//		javascript.click();
		
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest=new File("C:\\Users\\Public\\Downloads\\Test.jpeg");
//		FileHandler.copy(src, dest);
		
		

		
		
		
		
		
	}

}
