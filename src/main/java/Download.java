import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {
    public static final String URLDOWNLOAD = "https://the-internet.herokuapp.com/download";
    public WebDriver driver = new ChromeDriver();

    public String getLink() {
        return driver.findElement(By.cssSelector(".example a:nth-of-type(5)")).getAttribute("href");
    }

}
