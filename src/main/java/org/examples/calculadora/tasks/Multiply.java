package org.examples.calculadora.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.examples.calculadora.interactions.ClickOnButtonEqual;
import org.examples.calculadora.interactions.ClickOnButtonMultiply;
import org.examples.calculadora.interactions.ClickOnButtonOne;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Multiply implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOnButtonOne.calculator(),
                ClickOnButtonMultiply.calculator(),
                ClickOnButtonOne.calculator(),
                ClickOnButtonEqual.calculator()
        );
    }

    public static Multiply oneByOne(){
        return instrumented(Multiply.class);
    }
}
