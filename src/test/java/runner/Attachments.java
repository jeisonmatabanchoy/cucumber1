package runner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Attachments {
	@After
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot appiumDriver = null;
			@SuppressWarnings("null")
			byte[] data = ((TakesScreenshot) appiumDriver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", "My screenshot");         
        }
    }
}
