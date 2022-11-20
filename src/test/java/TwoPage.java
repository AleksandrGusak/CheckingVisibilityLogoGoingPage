import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TwoPage {

    @FindBy(how = How.XPATH, using = "/html/body/header/nav/div/a/img")
    private SelenideElement orderStatusNoImage;

    public boolean isImageOrderNotFound() {
        return orderStatusNoImage.isDisplayed();
    }

}
