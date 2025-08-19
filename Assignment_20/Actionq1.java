package Assignment_20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionq1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		WebElement double_click = driver.findElement(By.id("doubleClickBtn"));
		Actions act = new Actions(driver);
		act.doubleClick(double_click).perform();
		
		Thread.sleep(3000);
		WebElement right_click = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(right_click).perform();
		
		Thread.sleep(3000);
		WebElement clickme = driver.findElement(By.id("hMxlJ"));
		act.click(clickme).perform();

	}

}