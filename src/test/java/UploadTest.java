import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UploadTest{
    private WebDriver driver = new ChromeDriver();
    private GeneralUploadHelper h = new GeneralUploadHelper(driver);

    @BeforeMethod
    public void start() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(h.URLUPLOAD);
    }

    @Test
    public void uploadRobot() {
        RobotUpload r =new RobotUpload(driver);
        r.upload();
        String t = h.findReturnText();
        Assert.assertEquals(t,h.CONFIRMATIONTEXT);
    }

    @Test
    public void uploadViaInput(){
        InputUpload i =new InputUpload(driver);
        i.upload();
        String t = h.findReturnText();
        Assert.assertEquals(t,h.CONFIRMATIONTEXT);
    }

    @AfterMethod
    public void teardown () {
        driver.quit();
    }
}
