package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MaintenancePage  extends BasePage{

    public SelenideElement mainInput = $(byXpath("//input[@placeholder='Type for hints...']"));
    public SelenideElement btnSearch = $(byXpath("//button[@type='submit']"));
    public SelenideElement errorMessage = $(byText("Required"));
    public SelenideElement pass =$(byXpath("//input[@name='password']"));
    public SelenideElement confirm = $(byXpath("//button[@type='submit']"));

    public void employeeEmpty(){
        btnSearch.shouldBe(visible).click();

    }
    public void seeErrorEmpty(){
        errorMessage.shouldBe(visible);
    }
    public void SeeErrorInvalid(){
        errorMessage.shouldNotBe(visible);
    }
    public void invalidSearch(String name){
        mainInput.shouldBe(visible).setValue(name);
    }
    public void enterConfirm() {
        confirm.shouldBe(visible).click();
    }
    public void enterPassword(String text){
        pass.shouldBe(visible).setValue(text);
    }

}
