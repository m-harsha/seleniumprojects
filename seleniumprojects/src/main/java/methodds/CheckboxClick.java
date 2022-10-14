package methodds;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		
		List<WebElement> boxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement check:boxes) {
			check.click();
		}
		
		/*List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@id='gridCheck']"));
		//checkboxes.get(0).click();
		for(int i=0;i<checkboxes.size();i++) {
			
			checkboxes.get(i).click();
		}
		
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(int i=0;i<checkbox.size();i++) {
			
			checkbox.get(i).click();
			
			
		}*/
			}
		
				
			
			
		
	}
	



