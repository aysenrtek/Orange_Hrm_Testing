package StepDefinitions;

import Pages._10_11_Elements;
import io.cucumber.java.en.Then;

public class _11_UserStory_Steps {
    _10_11_Elements el =new _10_11_Elements();

    @Then("verify that “Add User” heading is displayed")
    public void verifyThatAddUserHeadingIsDisplayed() {
        el.Assertion(el.addUser,"Add User");

    }


}
