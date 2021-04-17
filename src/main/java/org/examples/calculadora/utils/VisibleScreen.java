package org.examples.calculadora.utils;

import org.sikuli.script.Screen;

public class VisibleScreen extends Screen {

    private static VisibleScreen screen;

    private VisibleScreen(){
        super();
    }

    public static VisibleScreen getVisibleScreen(){
        if(screen==null){
            screen = new VisibleScreen();
        }
        return screen;
    }
}
