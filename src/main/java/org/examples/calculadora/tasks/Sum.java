package org.examples.calculadora.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.examples.calculadora.utils.Loggers;
import org.examples.calculadora.utils.VisibleScreen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.examples.calculadora.userinterfaces.calculatorPage.SCREEN_ACTIONS;

public class Sum implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Screen screen = VisibleScreen.getVisibleScreen();

        try {
            screen.click(SCREEN_ACTIONS.targetOffset(-179,29));
            screen.click(SCREEN_ACTIONS.targetOffset(179,28));
            screen.click(SCREEN_ACTIONS.targetOffset(-179,29));
            screen.click(SCREEN_ACTIONS.targetOffset(174,98));
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
            Loggers.log("Error executing actions sum");
        }
    }

    public static Sum onePlusOne(){
        return instrumented(Sum.class);
    }
}
