package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.Then;

public class _09_UserStory_Steps {

    Elements RT=new Elements();
    @Then("verify that “Add” button is displayed.")
    public void verifyThatAddButtonIsDisplayed() {

        RT.waitUntilVisible(RT.addButton);
        //RT.Assertion(RT.addButton, verifyThatAddButtonIsDisplayed());

    }
}
