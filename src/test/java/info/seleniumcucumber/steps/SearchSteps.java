package info.seleniumcucumber.steps;


import info.seleniumcucumber.common.Base;
import info.seleniumcucumber.pages.ProductListPage;
import info.seleniumcucumber.pages.SearchPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class SearchSteps extends Base {

    @Before(order = 0)
    public void initDriver() {
        System.out.println("Open browser");
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","//Users//nearpe//IdeaProjects//SeleniumPractice/chromedriver");

    }

    @Before(order = 1)
    public void maximizeWindow() {
        System.out.println("Maximize window");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Given("I am on the homepage of {string} to do a single keyword search")
    public void i_am_on_the_homepage_of_to_do_a_single_keyword_search(String url) {
        driver.get(url);
    }

    @When("I do a single keyword search for {string}")
    public void i_do_a_single_keyword_search_for(String searchKeyword) {
        // Write code here that turns the phrase above into concrete actions
        searchPage=new SearchPage(driver);
        searchPage.clickOnSearchBox();
        searchPage.sendKeywordInSearch(searchKeyword);
    }

    @Then("Click on search button")
    public void click_on_search_button() {
        searchPage.clickOnSearchButton();
    }

    @Then("I see product list page")
    public void i_see_product_list_page() {
        // Write code here that turns the phrase above into concrete actions
        ProductListPage productListPage=new ProductListPage(driver);
        boolean checkProductListPage=productListPage.checkProductListPage();
        Assert.assertTrue(checkProductListPage);

    }

    @After(order = 0)
    public void teardown() {
        System.out.println("Close browser");
        driver.quit();
    }


}
