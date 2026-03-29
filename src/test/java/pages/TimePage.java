package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class TimePage extends BasePage {

    public SelenideElement employeeInput = $(byXpath("//input[@placeholder='Type for hints...']"));
    public SelenideElement viewButton = $(byXpath("//button[@type='submit']"));
    public SelenideElement errorMessage = $(byText("Required"));


    public void enterEmployeeName(String name) {
        employeeInput.shouldBe(visible).setValue(name);
    }

    public void clickView() {
        viewButton.shouldBe(visible).click();
    }


    public void shouldSeeRequiredError() {
        errorMessage.shouldBe(visible);
    }

    public void shouldNotSeeRequiredError() {
        errorMessage.shouldNotBe(visible);
    }
}
