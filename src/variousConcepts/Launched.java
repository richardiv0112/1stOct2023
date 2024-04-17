package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launched {
//for maven run as maven build
	//type clean install and run
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		//.get(); to open an url
		driver.get("https://www.google.com/");
		
		//used inspect element to find the name of the search bar
		driver.findElement(By.name("q"));
		
		//.click(); to click on something
		driver.findElement(By.xpath("//a[text()='About']")).click();
		
		//this gets the window to be full screen
		driver.manage().window().maximize();
		
		//This will delay an action by milliseconds
		//also needs a throws or try/catch declaration
		Thread.sleep(2000);
		
		//this will close the window
		driver.close();

	}

}
