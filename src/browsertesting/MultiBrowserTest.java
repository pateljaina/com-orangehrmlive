package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Firefox"; //given browser
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";//storing base url
    static WebDriver driver;

    public static void main(String[] args) {//if statement to open with Chrome, Firefox or Edge
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");//if wrong browser - print statement
        }
        driver.get(baseUrl);//places URL to browser(using the get method to open the URL
        System.out.println("The title of the page is: " + driver.getTitle());//print title directly without storing
        System.out.println("The current URL is: " + driver.getCurrentUrl());//print current url directly without storing
        System.out.println("The page source is: " + driver.getPageSource());//print page source directly without storing
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//give wait
        driver.findElement(By.name("username")).sendKeys("Admin");//add username to username field
        driver.findElement(By.name("password")).sendKeys("Admin123");//add password to password field
        driver.close();//close the browser
    }
}
