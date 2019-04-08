package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdFeatureStepDefinition {
    static WebDriver myDriver;

    @Given("^I am a Facebook user$")
    public void i_am_a_Facebook_user() {
        System.setProperty("webDriver.chrome.driver","C:\\Users\\narma\\IdeaProjects\\MyThirdMavenProject\\cromedriver.exe");
        myDriver = new ChromeDriver();

    }

    @When("^I can access Facebook website$")
    public void i_can_access_Facebook_website()
    {
        myDriver.get("https://www.facebook.com/");
    }

    @Then("^I see Facebook Home page$")
    public void i_see_Facebook_Home_page()
    {
        myDriver.quit();
    }

}
