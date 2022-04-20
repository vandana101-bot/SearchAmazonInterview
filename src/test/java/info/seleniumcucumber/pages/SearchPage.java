package info.seleniumcucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage {

@FindBy(xpath= "//input[@id='twotabsearchtextbox']")
private WebElement searchBox;

@FindBy(xpath="//span[@id='nav-search-submit-text']/input")
    private WebElement searchButton;

    public SearchPage(WebDriver driver1) {
        super(driver1);

    }

public void clickOnSearchBox(){
    searchBox.click();
}
public void sendKeywordInSearch(String searchKey){
    searchBox.sendKeys(searchKey);
}

public void clickOnSearchButton()
{
    searchButton.click();
}


}
