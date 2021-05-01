package org.examples.calculadora.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.examples.calculadora.questions.ResultOperation;
import org.examples.calculadora.tasks.MultiplyValues;
import org.examples.calculadora.tasks.SubtractValues;
import org.examples.calculadora.tasks.SumValues;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CalculatorWithParametersStepDefinitons {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("usuario");
    }

    @When("^user sum one value (\\d+) with other value (\\d+) plus one$")
    public void userSumOneValueWithOtherValuePlusOne(int arg1, int arg2) {
        theActorInTheSpotlight().attemptsTo(SumValues.inCalculator(arg1,arg2));
    }


    @Then("^the result is (\\d+)$")
    public void theResultIs(int arg1) {
        theActorInTheSpotlight().should(seeThat(ResultOperation.is(arg1)));
    }

    @When("^user subtract one value (\\d+) with other value (\\d+)$")
    public void userSubtractOneValueWithOtherValue(int arg1, int arg2) {
        theActorInTheSpotlight().attemptsTo(SubtractValues.inCalculator(arg1,arg2));
    }

    @When("^user multiply one value (\\d+) with other value (\\d+)$")
    public void userMultiplyOneValueWithOtherValue(int arg1, int arg2) {
        theActorInTheSpotlight().attemptsTo(MultiplyValues.inCalculator(arg1,arg2));
    }

}
