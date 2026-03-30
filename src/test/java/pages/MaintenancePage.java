package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MaintenancePage  extends BasePage{

    private final SelenideElement mainInput = $(byXpath("//input[@placeholder='Type for hints...']"));
    private final SelenideElement btnSearch = $(byXpath("//button[@type='submit']"));
    private final  SelenideElement errorMessage = $(byText("Required"));
    private final SelenideElement pass =$(byXpath("//input[@name='password']"));
    private final SelenideElement confirm = $(byXpath("//button[@type='submit']"));

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
