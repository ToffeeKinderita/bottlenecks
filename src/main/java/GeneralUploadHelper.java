import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralUploadHelper {
    public static final String FILEPATH = "C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg";
    public static final By SELECTBUTTON = By.cssSelector("#file-upload");
    public static final By UPLOADBUTTON = By.cssSelector("#file-submit");
    public static final String URLUPLOAD = "https://the-internet.herokuapp.com/upload";
    public static final String CONFIRMATIONTEXT = "File Uploaded!";
    public WebDriver driver;

    GeneralUploadHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void navClickSelectButton(){
        driver.findElement(SELECTBUTTON).click();
    }

    public void navSelectButtonSendKey(String path){
        driver.findElement(SELECTBUTTON).sendKeys(path);
    }

    public void navClickUploadButton(){
        driver.findElement(UPLOADBUTTON).click();
    }

    public String findReturnText(){
        return driver.findElement(By.cssSelector("h3")).getText();
    }
}
