package methodds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1Assg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement clickme1=driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		clickme1.click();
		String message1=driver.switchTo().alert().getText();
		System.out.println("alertmessage "+message1);
		driver.switchTo().alert().accept();
		
		WebElement clickme2=driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		clickme2.click();
		String message2=driver.switchTo().alert().getText();
		System.out.println("alertmessage "+message2);
		driver.switchTo().alert().dismiss();
		clickme2.click();
		driver.switchTo().alert().accept();
		
		WebElement clickprompt=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		clickprompt.click();
		driver.switchTo().alert().sendKeys("harsha");
		driver.switchTo().alert().dismiss();
		clickprompt.click();
		String message3=driver.switchTo().alert().getText();
		System.out.println("alertmessage "+message3);
		driver.switchTo().alert().sendKeys("harsha");
		driver.switchTo().alert().accept();
		

	}

}
