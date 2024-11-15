import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver givenDriver) {
        super(givenDriver);


    }
    //page element

    By userAvatarIcon = By.cssSelector("img.avatar");
    // helper method
    public WebElement getUserAvatar(){
        return findElement(userAvatarIcon);

    }
}
