package week4Assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		String text = driver.findElement(By.xpath("(//button[@id='Click'])[1]")).getText();
		System.out.println(text);
		driver.switchTo().frame(2);
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("(//button[text()='Click Me'])[2]")).click();
		String text2 = driver.findElement(By.xpath("(//button[text()='Click Me'])[2]")).getText();
		System.out.println(text2);
	}
}
