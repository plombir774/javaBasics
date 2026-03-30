package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;


import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private final SelenideElement usernameField = $(By.name("username"));
    private final  SelenideElement passwordField = $(By.name("password"));
    private final SelenideElement loginButton = $(By.xpath("//button[@type='submit']"));
    private final  SelenideElement errorMessage =$(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
    public void Creds(String user, String pass){
        usernameField.shouldBe(Condition.visible).setValue(user);
        usernameField.shouldHave(Condition.exactValue(user));
        passwordField.shouldBe(Condition.visible).setValue(pass);
        passwordField.shouldHave(Condition.exactValue(pass));
        loginButton.shouldBe(Condition.enabled).click();

    }
    public void checkErrorMessage(){
        errorMessage.shouldBe(Condition.visible);
        errorMessage.shouldHave(Condition.exactText("Invalid credentials"));
    }

}