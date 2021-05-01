package org.examples.calculadora.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.examples.calculadora.interactions.ClickOnButtonEqual;
import org.examples.calculadora.interactions.ClickOnButtonOne;
import org.examples.calculadora.interactions.ClickOnButtonSubtract;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Subtract implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOnButtonOne.calculator(),
                ClickOnButtonSubtract.calculator(),
                ClickOnButtonOne.calculator(),
                ClickOnButtonEqual.calculator()
        );
    }

    public static Subtract oneMinusOne() {
        return instrumented(Subtract.class);
    }
}
