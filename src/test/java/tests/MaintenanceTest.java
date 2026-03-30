package tests;

import org.testng.annotations.Test;
import pages.MaintenancePage;

public class MaintenanceTest extends BaseTest {

  private final  MaintenancePage main1 = new MaintenancePage();

    @Test

    public void shouldBeErrorWithEmptyInput(){
        main1.goToMain();
        main1.enterPassword("admin123");
        main1.enterConfirm();
        main1.employeeEmpty();
        main1.seeErrorEmpty(); // ожидаем ошибку с пустыми полями

    }
@Test
    public void shouldBeErrorWithInvalidInput(){
        main1.goToMain();
        main1.enterPassword("admin123");
        main1.enterConfirm();
        main1.invalidSearch("Nikita");
        main1.SeeErrorInvalid();    // ожидаем Invalid ошибку
    }
}
