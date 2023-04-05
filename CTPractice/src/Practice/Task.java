package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://onlinect.sharepoint.com/sites/interct/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='i0116']"));
		
		username.sendKeys("abhijeet.yadav@citiustech.com");
		
//		Thread.sleep(1000);
		
		WebElement next=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		next.click();
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='passwordInput']"));
		pass.sendKeys("Citiustech@2022");
		
		WebElement submit=driver.findElement(By.xpath("//span[@id='submitButton']"));
		submit.click();
		
		Thread.sleep(10000);
		
		WebElement no=driver.findElement(By.xpath("//input[@id='idBtn_Back']"));
		no.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement tools=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Tools']")));
		//WebElement tools=driver.findElement(By.xpath("//a[text()='Tools']"));
		
//		wait.until(ExpectedConditions.visibilityOf(tools));
		
		Thread.sleep(2000);
		
		try{tools.click();}
		catch( ElementClickInterceptedException r) {
			tools.click();
		}
		
		WebElement psg=driver.findElement(By.xpath("//img[@title='PGS']"));
		
		psg.click();
		Thread.sleep(3000);
		
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String a="";
				
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='HRIS']"))).click().build().perform();
		
		driver.findElement(By.xpath("//span[text()='Employee Details']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_pnlMainLables']//tr//descendant :: span[@id='ctl00_ContentPlaceHolder1_lblCTEmpID1']")).getText());
		
	    driver.findElement(By.xpath("//td[@id='tdEmpInfo']//tr[@id='trGroup1']//td[@id='tdTravel']")).click();
		
	    WebElement country=driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTravelCountry']"));
		
	    WebElement type=driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTypeOfTravel']"));
	    
	    WebElement tripno=driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTravelNoOfTrips']"));
	    
	    WebElement duration=driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTravelEstDuration']"));
	    
	    WebElement addbutton=driver.findElement(By.xpath("//input[@id='btnTravelAdd']"));
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,4000)");
	    
	    Thread.sleep(10000);
	    
	    
	    Select countrydrop=new Select(country);
	    
	    Select typedrop=new Select(type);
	    
	    Select tripnodrop=new Select(tripno);
	    
	    Select durationdrop=new Select(duration);
	    
	    countrydrop.selectByIndex(1);
	    typedrop.selectByIndex(1);
	    tripnodrop.selectByIndex(1);
	    durationdrop.selectByIndex(1);
	    addbutton.click();
	    
	    
	    Thread.sleep(2000);
	    
	    countrydrop.selectByIndex(2);
	    typedrop.selectByIndex(2);
	    tripnodrop.selectByIndex(1);
	    durationdrop.selectByIndex(2);
	    addbutton.click();
	    
	    Thread.sleep(2000);
	    
	    countrydrop.selectByIndex(3);
	    typedrop.selectByIndex(3);
	    tripnodrop.selectByIndex(1);
	    durationdrop.selectByIndex(3);
	    addbutton.click();
	    
	    Thread.sleep(2000);
	    
	    countrydrop.selectByIndex(4);
	    typedrop.selectByIndex(4);
	    tripnodrop.selectByIndex(1);
	    durationdrop.selectByIndex(1);
	    addbutton.click();
	    
	    List <WebElement> remove=driver.findElements(By.xpath("(//table[@id='ctl00_ContentPlaceHolder1_grdTravel']//tbody//tr//img[@src='images/Delete.png'])"));
	    
	    remove.size();
	    System.out.println(remove.size());
	    Thread.sleep(3000);
	    
	    try{remove.get(2).click();}
	    catch(StaleElementReferenceException z)
	    {remove.get(2).click();}
	    
//	    File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    File dest= new File("");
//	    FileHandler.copy(src, dest);
//	    
//	    driver.quit();
	    
	    
	    
		
		
		
		
	}

}
