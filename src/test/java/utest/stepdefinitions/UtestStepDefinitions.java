package utest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utest.model.UserData;
import utest.question.Answer;
import utest.task.*;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^:I enter the Utest site to register\\.$")
    public void iEnterTheUtestSiteToRegister() {
        theActorCalled("Jean").wasAbleTo(OpenUp.thePage());
    }

    @When("^:I enter my data in the form$")
    public void iEnterMyDataInTheForm(List<UserData> userData) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                SignUpStep1.onThePageStep1(userData),
                SignUpStep2.onThePageStep2(userData),
                SignUpStep3.onThePageStep3(),
                SignUpStep4.onThePageStep4(userData)
        );
    }
    @Then("^:I register my data and access the welcome page$")
    public void iRegisterMyDataAndAccessTheWelcomePage(List<UserData> userData) throws Exception{
        theActorInTheSpotlight().should(seeThat(Answer.toThe(userData)));
    }
}
