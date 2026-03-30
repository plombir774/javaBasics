package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;



        public class BaseTest {

            public LoginPage loginPage = new LoginPage();

            @BeforeMethod
            public void setUp() {

                SelenideLogger.addListener("AllureSelenide",
                        new AllureSelenide()
                                .screenshots(true)
                                .savePageSource(true));


                open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


                loginPage.Creds("Admin", "admin123");
            }
        }




