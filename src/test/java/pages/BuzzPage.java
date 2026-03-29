package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BuzzPage extends BasePage {

    public SelenideElement postInput = $("textarea[placeholder=\"What's on your mind?\"]");
    public SelenideElement postButton = $(byXpath("//button[@type='submit']"));

    public void createPost(String text){
        postInput.setValue(text);
        postButton.click();

    }


}