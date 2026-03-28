package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    @Test
    public void loginWithValidCreds() {
        LoginPage loginPage = new LoginPage();

        loginPage
                .openPage()
                .login("Admin", "admin123");

        // проверка успешного входа
    }
}