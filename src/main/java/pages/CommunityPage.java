package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommunityPage extends BasePage {

//    private IOSElement loginButton;

    public CommunityPage(IOSDriver<WebElement> driver) {
        super(driver);
        driver.get("https://builtin.com/onboarding");
    }

    public boolean urlIsCommunityPageURL() {
        return driver.getCurrentUrl().equals("https://builtin.com/onboarding");
    }

    public boolean isLoginButtonEnabled() {
        IOSElement loginButton = (IOSElement) driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/div/div[2]"));
        return loginButton.isEnabled();
    }
}