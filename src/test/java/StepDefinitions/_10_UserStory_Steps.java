package StepDefinitions;

import Pages.Elements;
import Pages._10_11_Elements;
import io.cucumber.java.en.Then;

public class _10_UserStory_Steps {
    _10_11_Elements ell = new _10_11_Elements();
    Elements el =new  Elements();



    @Then("verify that all the required elements are displayed")
    public void verifyThatAllTheRequiredElementsAreDisplayed() {

        ell.Assertion(ell.userRole, "User Rol");
        ell.Assertion(ell.employeeName, "Nam");
        ell.Assertion(ell.status, "Statu");
        ell.Assertion(ell.username, "Username");
        ell.Assertion(ell.password, "Password");
        ell.Assertion(ell.confirmPassword, "Confirm Password");
        el.Assertion(ell.cancel, "Cancel");
        ell.Assertion(ell.save, "Save");
    }
}
