package StepDefinitions;

import Pages._07_Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _07_UserStory_Steps {
    _07_Elements us7=new _07_Elements();
    @And("Entering value less than five characters in the UNF")
    public void enteringValueLessThanFiveCharactersInTheUNF() {
        us7.sendKeysFunction(us7.essUserInput, "heyo");
    }

    @Then("Verify five character message")
    public void verifyFiveCharacterMessage() {
        us7.Assertion(us7.lessThanFive, "Should");
    }
}
