package org.examples.calculadora.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.examples.calculadora.tasks.AbrirConRobot;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CalculatorRobotStepDefinitions {

    @Before
    public void prepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Usuario");
    }

    @Dado("^Que la calculadora esta abierta con la clase robot$")
    public void queLaCalculadoraEstaAbiertaConLaClaseRobot() {
       theActorInTheSpotlight().wasAbleTo(AbrirConRobot.calculadora());
    }


    @Cuando("^el usuario suma uno mas uno$")
    public void elUsuarioSumaUnoMasUno() {

    }

    @Entonces("^el resultado es dos$")
    public void elResultadoEsDos() {

    }
}
