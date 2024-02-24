package edu.eci.cvds.tdd.registry;

public class detectorEdadExeption extends Exception{

    public static final String EDAD_INVALIDA = "edad invalida";

    public detectorEdadExeption (String m) {
        super(m);
    }

}

