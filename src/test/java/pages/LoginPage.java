package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private final SelenideElement usernameField = $(By.name("username"));
    private final SelenideElement passwordField = $(By.name("password"));
    private final SelenideElement loginButton = $(By.xpath("//button[@type='submit']"));

    public LoginPage openPage() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        return this;
    }

    public LoginPage enterUsername(String username) {
        usernameField.setValue(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    public LoginPage clickLogin() {
        loginButton.click();
        return this;
    }

    public LoginPage login(String username, String password) {
        return enterUsername(username)
                .enterPassword(password)
                .clickLogin();
    }
}