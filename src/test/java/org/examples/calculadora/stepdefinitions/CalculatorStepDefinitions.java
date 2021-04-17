package org.examples.calculadora.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.examples.calculadora.questions.MultiplicationResult;
import org.examples.calculadora.questions.SubtractResult;
import org.examples.calculadora.questions.SumResult;
import org.examples.calculadora.tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CalculatorStepDefinitions {

    @Before
    public void SetUp(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Actor");
    }

    @Given("^The windows's calculator is open$")
    public void theWindowsSCalculatorIsOpen() {
        theActorInTheSpotlight().wasAbleTo(OpenWindows.calculator());
    }

    @When("^user sum one plus one$")
    public void userSumOnePlusOne() {
        theActorInTheSpotlight().attemptsTo(Sum.onePlusOne());
    }

    @Then("^the result is two$")
    public void theResultIsTwo() {
        theActorInTheSpotlight().should(seeThat(SumResult.isTwo()));
    }

    @When("^user subtract one plus one$")
    public void userSubtractOnePlusOne() {
        theActorInTheSpotlight().attemptsTo(Subtract.oneMinusOne());
    }

    @Then("^the result is zero$")
    public void theResultIsZero() {
        theActorInTheSpotlight().should(seeThat(SubtractResult.isZero()));
    }

    @When("^user multiply one by one$")
    public void userMultiplyOneByOne() {
        theActorInTheSpotlight().attemptsTo(Multiply.oneByOne());
    }


    @Then("^the result is one$")
    public void theResultIsOne() {
        theActorInTheSpotlight().should(seeThat(MultiplicationResult.isOne()));
    }



    @After
    public void closeApplication(){
        theActorInTheSpotlight().attemptsTo(Close.calculator());
    }
}
