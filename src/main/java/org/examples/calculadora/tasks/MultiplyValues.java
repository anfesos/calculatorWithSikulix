package org.examples.calculadora.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.examples.calculadora.interactions.ClickOn;
import org.examples.calculadora.interactions.ClickOnButtonEqual;
import org.examples.calculadora.interactions.ClickOnButtonMultiply;
import org.examples.calculadora.interactions.ClickOnButtonSubtract;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MultiplyValues implements Task {

    private int firstValue;
    private int secondValue;

    public MultiplyValues(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOn.value(firstValue),
                ClickOnButtonMultiply.calculator(),
                ClickOn.value(secondValue),
                ClickOnButtonEqual.calculator()
        );
    }

    public static MultiplyValues inCalculator(int firstValue,int secondValue){
        return instrumented(MultiplyValues.class,firstValue,secondValue);
    }
}
