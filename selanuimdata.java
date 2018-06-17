import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selanuimdata {
	 // static String sd;
	static WebDriver D;
	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver","A:\\ANDROID DEVELOPMENT\\selenium-java-3.12.0\\chromedriver_win32\\chromedriver.exe");
		 D=new ChromeDriver();
		D.get("https://www.facebook.com/");
		Thread.sleep(10000);
		 D.findElement(By.id("email")).sendKeys("samar.naseem.35");
		                                                                D.findElement(By.id("pass")).sendKeys("areeba samar2816");
		 D.findElement(By.id("u_0_2")).click();
		 
		 
		 //click();
		
	}
		catch(Exception e) {
			System.out.println("error");
			// D=new ChromeDriver();
				//D.get(ti);
				 //D.findElement(By.id("email")).sendKeys("samar.naseem.35");
		}
	}
}
