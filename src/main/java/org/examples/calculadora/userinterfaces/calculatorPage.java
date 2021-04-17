package org.examples.calculadora.userinterfaces;

import org.sikuli.script.Pattern;

public class calculatorPage {

    public static final String RUTA_PROYECTO = System.getProperty("user.dir");

    public static final Pattern SEARCH_WINDOWS = new Pattern(RUTA_PROYECTO + "/src/main/resources/captures/buscador.png");
    public static final Pattern OPEN_CALCULATOR = new Pattern(RUTA_PROYECTO + "/src/main/resources/captures/abrirCalculadora.png");
    public static final Pattern SCREEN_ACTIONS = new Pattern(RUTA_PROYECTO + "/src/main/resources/captures/pantallaAcciones.png");
    public static final Pattern RESULT_ONE = new Pattern(RUTA_PROYECTO + "/src/main/resources/captures/resultado1.png");
    public static final Pattern RESULT_TWO = new Pattern(RUTA_PROYECTO + "/src/main/resources/captures/resultado2.png");
    public static final Pattern RESULT_ZERO = new Pattern(RUTA_PROYECTO + "/src/main/resources/captures/resultadoCero.png");
    public static final Pattern CLOSE_WINDOW = new Pattern(RUTA_PROYECTO + "/src/main/resources/captures/accionesVentana.png");
}
