package infrastructure;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pageObjects.MultipleSortingHomePage;

public class BaseTest {

    protected MultipleSortingHomePage multipleSortingHomePage = new MultipleSortingHomePage();

    @BeforeEach
    public void beforeEachTest() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }

    @AfterEach
    public void afterEachTes() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWebDriver();
    }
}
