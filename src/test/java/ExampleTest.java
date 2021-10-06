import infrastructure.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class ExampleTest extends BaseTest {

    @Test
    public void userCanLoginByUsername() {
        multipleSortingHomePage.openHomePage();
    }
}
