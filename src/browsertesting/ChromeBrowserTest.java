package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";//Launch the Chrome browser
        WebDriver driver = new ChromeDriver();//Open URL into browser
        driver.get(baseUrl);//Places URL to browser(using the get method to open Url)
        driver.manage().window().maximize();//maximise the window
        System.out.println("The title of the page is " + driver.getTitle());//print title directly without storing
        System.out.println("The current URL is:  " + driver.getCurrentUrl());//print current url directly without storing
        System.out.println("The page source is:  " + driver.getPageSource());//print page source directly without storing
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//give weight
        driver.findElement(By.name("username")).sendKeys("Admin");//enter username into username field
        driver.findElement(By.name("password")).sendKeys("Admin123");//enter password to password field
        driver.close();//close driver
    }
}
