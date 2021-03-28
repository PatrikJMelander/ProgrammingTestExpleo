/**
 * Created by Patrik Melander
 * Date: 2021-03-28
 * Time: 11:09
 * Project: ProgrammingTestExpleo
 * Copyright: MIT
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.*;
import java.util.List;

/**
 * Created by Patrik Melander
 * Date: 2021-03-28
 * Time: 10:24
 * Project: ProgrammingTestExpleo
 * Copyright: MIT
 */


public class FindLinks {
    public static void main(String[] args) {
        String key = "webdriver.chrome.driver";
        String value = "src/main/resources/chromedriver.exe";
        String pageToSearch ="https://www.google.com/";

        WebDriver driver = null;
        System.setProperty(key, value);

        driver = new ChromeDriver();

        driver.get(pageToSearch);

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (var a : links) {
            System.out.println(a.getText() + " – " + a.getAttribute("href"));
        }
        driver.close();
    }

}
