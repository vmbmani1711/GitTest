package a1_sampletest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	@Test
	public void validatebing() throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://www.google.com/");
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
		File ss=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("C:/java program/workspace/J1_Git/file/google.png"));
	}
}
