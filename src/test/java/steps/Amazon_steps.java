package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class Amazon_steps {

    AmazonPage ap = new AmazonPage();

    @When("User enters headphones keyword")
    public void user_enters_headphones_keyword() {
        ap.amazonSearchBox.sendKeys("headphones");
    }

    @When("User clicks amazon search button")
    public void user_clicks_amazon_search_button() {
        ap.searchButton.click();
    }

    @Then("User should see headphones in results")
    public void user_should_see_headphones_in_results() {
        Assert.assertTrue(ap.resultText.getText().contains("headphones"));
    }
}
