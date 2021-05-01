package org.examples.calculadora.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.examples.calculadora.utils.VisibleScreen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import static org.examples.calculadora.userinterfaces.calculatorPage.SCREEN_ACTIONS;

public class ClickOnButtonTwo implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Screen screen = VisibleScreen.getVisibleScreen();

        try {
            screen.click(SCREEN_ACTIONS.targetOffset(-55,28));
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public static ClickOnButtonTwo calculator(){
        return new ClickOnButtonTwo();
    }
}
