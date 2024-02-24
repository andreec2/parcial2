package edu.eci.cvds.tdd.registry;

import java.util.Set;
import java.util.HashSet;

public class detectorEdad {
    boolean respuesta = false;
    public boolean registerVoter(Person p) throws detectorEdadExeption {

        if (p.getAge() <= 0 || p.getAge() >= 135) {
            throw new detectorEdadExeption(detectorEdadExeption.EDAD_INVALIDA);
        }

        if (p.getAge() >= 0 && p.getAge() <= 17){
            respuesta = true;
        }
        return respuesta;
    }
}