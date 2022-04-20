package info.seleniumcucumber.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    public AbstractPage(WebDriver driver1){
        PageFactory.initElements(driver1, this);
    }


}
