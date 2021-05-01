package org.examples.calculadora.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirConRobot implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            //https://darkbyteblog.wordpress.com/2011/01/17/java-clase-java-awt-robot-control-del-raton-teclado-y-captura-de-pantalla/
            Robot robot = new Robot();

            robot.mouseMove(102, 746);
            robot.delay(250);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(250);

            int teclas[] = {
                KeyEvent.VK_C,KeyEvent.VK_A,KeyEvent.VK_L
            };

            for(int i= 0;i<teclas.length;i++){
                robot.keyPress(teclas[i]);
                robot.keyRelease(teclas[i]);
                robot.delay(250);
            }

            robot.mouseMove(82,197);

            robot.delay(250);

            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);

            robot.delay(250);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static AbrirConRobot calculadora(){
        return instrumented(AbrirConRobot.class);
    }
}
