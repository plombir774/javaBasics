package tests;

import org.testng.annotations.Test;

import pages.BuzzPage;

public class BuzzTest extends BaseTest {

    BuzzPage basepage = new BuzzPage();

    @Test

    public void  userCanPostMessage(){
        basepage.goToBuzz();
        basepage.createPost("Privet vsem"); //можно сделать пост своего сообщения
    }

}
