package org.examples.calculadora.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.examples.calculadora.utils.VisibleScreen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import static org.examples.calculadora.userinterfaces.calculatorPage.RESULT;

public class ResultOperation implements Question<Boolean> {

    private int expectedResult;

    public ResultOperation(int expectedResult) {
        this.expectedResult = expectedResult;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Screen screen = VisibleScreen.getVisibleScreen();

        try {
            screen.find(RESULT(expectedResult));
            return true;
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
            return false;
        }
    }

    public static ResultOperation is(int expectedResult) {
        return new ResultOperation(expectedResult);
    }
}
