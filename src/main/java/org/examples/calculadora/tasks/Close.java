package org.examples.calculadora.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.examples.calculadora.utils.VisibleScreen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.examples.calculadora.userinterfaces.calculatorPage.CLOSE_WINDOW;

public class Close implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Screen screen = VisibleScreen.getVisibleScreen();

        try {
            screen.click(CLOSE_WINDOW.targetOffset(44,-3));
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public static Close calculator(){
        return instrumented(Close.class);
    }
}
