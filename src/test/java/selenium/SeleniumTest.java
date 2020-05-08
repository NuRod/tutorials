package selenium;
import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
//
import static com.codeborne.selenide.Selenide.*;

public class SeleniumTest {
    @Test
    public void automationTest() {
        open("http://explorecalifornia.org/contact.htm");
        $( By.cssSelector("#name")).should(Condition.appear);
        $( By.cssSelector("#comments")).should(Condition.appear);

    }
}
