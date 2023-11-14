import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
       //Browser set up
       String baseurl = "https://opensource-demo.orangehrmlive.com/";
       //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //open the URL into Browser
        driver.get(baseurl);

        driver.manage().window().maximize();
//Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Print the current URL
        System.out.println("The current URL : " + driver.getCurrentUrl());
        //Print the page source
        System.out.println(driver.getPageSource());

        //Click on forgot your password link
        WebElement ForgotYourPasswordLink = driver.findElement(By.linkText("Forgot your password?" ));
        ForgotYourPasswordLink.click();

        //Navigated back to the login page.
        driver.navigate();
        String loginUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        //Refresh the page
        driver.navigate().refresh();



        //Enter the email address to email address field
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        usernameField.sendKeys("prime");
        //Enter the password to password field
        WebElement passwordFiled = driver.findElement(By.id("password"));
        passwordFiled.sendKeys("1111");

     //Click on login button
     WebElement loginButton = driver.findElement(By.id("btnLogin"));
     loginButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Close the browser
        driver.close();


    }
}
