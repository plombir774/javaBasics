package tests;

import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
  public  LoginPage loginPage = new LoginPage();
    @BeforeMethod
    public void BasicLogin(){
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.Creds("Admin","admin123");


    }
}
