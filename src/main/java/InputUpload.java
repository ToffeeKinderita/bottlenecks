import org.openqa.selenium.WebDriver;

import java.io.File;

public class InputUpload extends GeneralUploadHelper implements UploadStragedy {
    InputUpload(WebDriver driver) {
        super(driver);
    }

    @Override
    public void upload() {
        File file = new File(FILEPATH);
        navSelectButtonSendKey(file.getAbsolutePath());
        navClickUploadButton();
    }
}