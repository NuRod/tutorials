package selenium;
import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;
//import static com.codeborne.selenide.Condition.*;
/* Selenide
1. Open the page
2. $(element).doAction()
3. $(element).check(condition)

  open("/login");
  $("#submit").click();
  $(".message").shouldHave(text("Hello"));
*/
public class SeleniumTest {
    @Test
    public void automationTest() {
        open("http://explorecalifornia.org/contact.htm");
        $( "#name").should(appear);
        $( "#comments").should(appear);

        $( "#name").setValue("Nuno");

        $(By.name("state")).should(appear).selectOptionContainingText("Texas");
        $( "#backpack").click();
        $(By.name("newsletter")).selectRadio("yes");

        $( "#name").shouldHave(Condition.value("Nuno"));
        String state = $("#state").should(appear).getSelectedText();
        assert(state).equals("Texas");

        $( "#backpack").shouldBe(selected);
        $(By.name("newsletter")).shouldHave(value("yes"));
    }
}
