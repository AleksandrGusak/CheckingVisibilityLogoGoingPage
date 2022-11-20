import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class StartPage {

    public static final String URL = "https://terminal-ltd.com/";

    @FindBy(how = How.CLASS_NAME, using = "open-password-enter")
    private SelenideElement clickButtonInput;

    @FindBy(how = How.XPATH, using = ".//input[@name='Login.Username']")
    private SelenideElement userName;

    @FindBy(how = How.XPATH, using = ".//input[@name= 'Login.Password']")
    private SelenideElement passwordField;

    @FindBy(how = How.XPATH, using = "/html/body/div/main/div/div/div/div[1]/div/div/div[7]/div/form/button")
    private SelenideElement clickButton;

    public StartPage clickButtonStatusInput() {
        clickButtonInput.click();
        return this;
    }

    public StartPage userNameStatus(String nameUser) {
        userName.setValue(nameUser);
        return this;
    }

    public StartPage passwordStatus(String fieldPassword) {
        passwordField.setValue(fieldPassword);
        return this;
    }

    public TwoPage clickButtonStatus() {
        clickButton.click();
        return page(TwoPage.class);
    }
}
