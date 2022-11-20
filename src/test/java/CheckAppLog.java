import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;


public class CheckAppLog {

    @Test
    public void checkAppLogging() {

        final String realName = "ggguusak1@gmail.com";
        final String realPassword = "ggguusak777";


        boolean isNotFoundImageDisplayeed = open(StartPage.URL, StartPage.class)
                .clickButtonStatusInput()
                        .userNameStatus(realName)
                                .passwordStatus(realPassword)
                                        .clickButtonStatus()
                                                .isImageOrderNotFound();


        assertTrue("Iogo not vision", isNotFoundImageDisplayeed);
    }
}