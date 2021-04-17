package org.examples.calculadora.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.examples.calculadora.utils.VisibleScreen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import static org.examples.calculadora.userinterfaces.calculatorPage.RESULT_ZERO;

public class SubtractResult implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Screen screen = VisibleScreen.getVisibleScreen();

        try {
            screen.find(RESULT_ZERO);
            return true;
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
            return false;
        }
    }

    public static SubtractResult isZero(){
        return new SubtractResult();
    }
}
