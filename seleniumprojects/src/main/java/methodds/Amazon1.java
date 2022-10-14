package methodds;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		System.out.println(searchbutton.getSize());
		//org.openqa.selenium.Dimension s=searchbutton.getSize();
		//System.out.println(s.height);
		System.out.println("x cordinate"+searchbutton.getLocation().x);
		System.out.println("y cordinate"+searchbutton.getLocation().y);
		String html=driver.getPageSource();
		System.out.println(html);
		

	}

}
