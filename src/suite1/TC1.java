package suite1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TC2 m=new TC2();
		
		//System.out.println(m.ValidateHeader());
	//==============================================
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
				
	}
}
