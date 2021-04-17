package org.examples.calculadora.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.examples.calculadora.utils.VisibleScreen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.examples.calculadora.userinterfaces.calculatorPage.*;

public class OpenWindows implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Screen ventana = VisibleScreen.getVisibleScreen();

        try {

            ventana.wait(SEARCH_WINDOWS,3);
            ventana.click(SEARCH_WINDOWS);
            ventana.wait(1.0);
            ventana.type("Calculadora");
            ventana.wait(OPEN_CALCULATOR,3);
            ventana.click(OPEN_CALCULATOR);
            ventana.wait(SCREEN_ACTIONS);

        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public static OpenWindows calculator(){
        return instrumented(OpenWindows.class);
    }
}
