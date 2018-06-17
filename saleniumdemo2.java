import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saleniumdemo2 {
	
   public static void main(String[] args) throws Exception {
	
	   System.setProperty("webdriver.chrome.driver", "A:\\ANDROID DEVELOPMENT\\selenium-java-3.12.0\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	   WebDriver D=new ChromeDriver();
	  
	   D.get("https://www.facebook.com");
	   String s = D.findElement(By.id("email")).getTagName();
	   System.out.println(s);
	   D.quit();
}

}
