package Pages;

import Steps.StepsDefinition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends StepsDefinition {

    public LogoutPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Logout")
    public WebElement LogoutButton;

    //--------------

    public void clickOnLogoutButton() {
        LogoutButton.click();


    }

}
