package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    @Test
    public void loginWithValidCreds() {

        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage.Creds("Nikita","admin123");

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