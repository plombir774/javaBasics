package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest  {
private final    LoginPage loginPage = new LoginPage();
    @Test
    public void loginWithValidCreds() {

        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage.Creds("Admin","admin123");
        $(".oxd-topbar-header").shouldBe(visible);

           //ожидаем успешный вход с валидными данными
    }
@Test
public void loginWithInvalidCreds(){
    open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    loginPage.Creds("Nikita","admin123");
    //введи невалидный username
    loginPage.checkErrorMessage();
    //ожидаем ошибку с точным сообщением

    }
}