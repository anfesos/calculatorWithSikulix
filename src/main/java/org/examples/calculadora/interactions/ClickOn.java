package org.examples.calculadora.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class ClickOn implements Interaction {

    private int value;

    public ClickOn(int value) {
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (value){
            case 0:
                actor.attemptsTo(ClickOnButtonZero.calculator());
                break;
            case 1:
                actor.attemptsTo(ClickOnButtonOne.calculator());
                break;
            case 2:
                actor.attemptsTo(ClickOnButtonTwo.calculator());
                break;
            case 3:
                actor.attemptsTo(ClickOnButtonThree.calculator());
                break;
            case 4:
                actor.attemptsTo(ClickOnButtonFour.calculator());
                break;
            case 5:
                actor.attemptsTo(ClickOnButtonFive.calculator());
                break;
            case 6:
                actor.attemptsTo(ClickOnButtonSix.calculator());
                break;
            case 7:
                actor.attemptsTo(ClickOnButtonSeven.calculator());
                break;
            case 8:
                actor.attemptsTo(ClickOnButtonEight.calculator());
                break;
            case 9:
                actor.attemptsTo(ClickOnButtonNine.calculator());
                break;
            default:
                System.out.println("Implementar log");
        }
    }

    public static ClickOn value(int value){
        return new ClickOn(value);
    }
}
