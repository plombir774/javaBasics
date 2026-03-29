package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;


import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    public SelenideElement usernameField = $(By.name("username"));
    public SelenideElement passwordField = $(By.name("password"));
    public SelenideElement loginButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement errorMessage =$(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
    public void Creds(String user, String pass){
        usernameField.setValue(user);
        usernameField.shouldHave(Condition.exactValue(user));
        passwordField.setValue(pass);
        passwordField.shouldHave(Condition.exactValue(pass));
        loginButton.click();

    }
    public void checkErrorMessage(){
        errorMessage.shouldHave(Condition.visible);
        errorMessage.shouldHave(Condition.exactText("Invalid credentials"));
    }

}