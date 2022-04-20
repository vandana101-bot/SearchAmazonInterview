package info.seleniumcucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage extends AbstractPage{
    @FindBy(xpath="//div[@class='s-no-outline']")
    private WebElement resultTextOutline;

    public ProductListPage(WebDriver driver1) {
        super(driver1);
    }

public boolean checkProductListPage() {
    boolean isVisible;
    if (resultTextOutline.isDisplayed()) {
        isVisible=true;
    } else {
        isVisible=false;
    }
    return isVisible;
}
}