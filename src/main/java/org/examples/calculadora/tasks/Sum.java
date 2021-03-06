package org.examples.calculadora.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.examples.calculadora.interactions.ClickOnButtonEqual;
import org.examples.calculadora.interactions.ClickOnButtonOne;
import org.examples.calculadora.interactions.ClickOnButtonSum;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Sum implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOnButtonOne.calculator(),
                ClickOnButtonSum.calculator(),
                ClickOnButtonOne.calculator(),
                ClickOnButtonEqual.calculator()
        );
    }

    public static Sum onePlusOne(){
        return instrumented(Sum.class);
    }
}
