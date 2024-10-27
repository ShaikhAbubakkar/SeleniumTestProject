import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JenSel {
public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.geeksforgeeks.org/learn-data-structures-and-algorithms-dsa-tutorial/");
        //getTitle() to obtain title of the page
    System.out.println("Page tile is: " + driver.getTitle());
    driver.close();
    }
}