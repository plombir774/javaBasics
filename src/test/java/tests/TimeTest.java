package tests;

import org.testng.annotations.Test;
import pages.TimePage;

public class TimeTest extends BaseTest {

    TimePage timepage = new TimePage();

    @Test

    public void userShouldSeeErrorWhenEmployeeIsEmpty() {
        timepage.goToTime();
        timepage.clickView();
        timepage.shouldSeeRequiredError(); // ожидаем ошибку при пустом поле
    }


    @Test
    public void userShouldNotSeeErrorWhenEmployeeIsFilled() {
        timepage.goToTime();
        timepage.enterEmployeeName("Nikita");
        timepage.clickView();
        timepage.shouldNotSeeRequiredError(); // не видим ошибку при заполненном поле
    }
}
