package july2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
		Select s1=new Select(driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT']")));
	s1.selectByValue("3");
	Select s2=new Select(driver.findElement(By.xpath("//*[@id=\'ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD\']")));
	s2.selectByIndex(2);	
	Select s3=new Select(driver.findElement(By.xpath("//*[@id=\'ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT\']")));
s3.selectByValue("1");
System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected());
driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).click();
System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected());
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
//Thread.sleep(3000);
driver.findElement(By.xpath("//a[@value='BLR']")).click();
driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
driver.findElement(By.xpath("//span[text()='Next']")).click();
driver.findElement(By.xpath("//span[text()='Next']")).click();
driver.findElement(By.xpath("//a[@data-date='15']")).click();
driver.findElement(By.cssSelector("#custom_date_picker_id_2")).click();
driver.findElement(By.xpath("//span[text()='Next']")).click();
driver.findElement(By.xpath("//a[@data-date='19']")).click();
Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
driver.findElement(By.linkText("You 1st")).click();//*
}
}
