package org.fundationjala;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fundacionjala.Bowl;

public class bowlSteps {
    @Given("I have {int} cookies in my bowl")
    public void i_have_cookies_in_my_bowl(int cookies)  {
        Bowl bowl = new Bowl();
        bowl.eat(cookies);
    }

    @When("I wait {int} hour")
    public void iWaitHour(int arg0) {
    }

    @Then("my bowl should be empty")
    public void myBowlShouldBeEmpty() {
    }
}
