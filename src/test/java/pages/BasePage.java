package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public SelenideElement buzzMenu = $(byText("Buzz"));

  public void goToBuzz(){
      buzzMenu.shouldBe(visible).click();
  }

  public SelenideElement time = $(byXpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']) [4]"));

  public void goToTime(){
      time.shouldBe(visible).click();
  }
public SelenideElement main =$(byText("Maintenance"));

  public void goToMain(){
      main.shouldBe(visible).click();

  }
}