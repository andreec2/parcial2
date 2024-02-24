package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

import static edu.eci.cvds.tdd.registry.Gender.*;
import static org.junit.Assert.fail;

public class detectorEdadTest {
    private boolean result = false;
    private detectorEdad prueba = new detectorEdad();

    // Nuevos test para parcial 1

    @Test
    public void menorEdad() {
        Person person = new Person("Martín", 102, 17, MALE, true);
        boolean result = false;
        try {
            result = prueba.registerVoter(person);
        } catch (detectorEdadExeption e) {

        }
        Assert.assertEquals(true, result);
    }

    @Test
    public void menorEdad2() {
        Person person = new Person("Maria", 102, 1, MALE, true);
        boolean result = false;
        try {
            result = prueba.registerVoter(person);
        } catch (detectorEdadExeption e) {
            fail("fallodatosinvalidos");
        }
        Assert.assertEquals(true, result);
    }

    @Test
    public void menorEdad3() {
        Person person = new Person("Felipe", 102, 11, MALE, true);
        boolean result = false;
        try {
            result = prueba.registerVoter(person);
        } catch (detectorEdadExeption e) {
            fail("fallodatosinvalidos");
        }
        Assert.assertEquals(true, result);
    }

    @Test
    public void menorEdad4() {
        Person person = new Person("Martín", 102, 17, MALE, true);
        boolean result = false;
        try {
            result = prueba.registerVoter(person);
        } catch (detectorEdadExeption e) {
            fail("fallodatosinvalidos");
        }
        Assert.assertEquals(true, result);
    }


    @Test
    public void menorEdad6() {
        Person person = new Person("Felipe", 102, 18, MALE, true);
        boolean result = false;
        try {
            result = prueba.registerVoter(person);
        } catch (detectorEdadExeption e) {
            fail("fallodatosinvalidos");
        }
        Assert.assertEquals(false, result);
    }

    @Test
    public void menorEdad65() {
        Person person = new Person("Felipe", 102, 25, MALE, true);
        boolean result = false;
        try {
            result = prueba.registerVoter(person);
        } catch (detectorEdadExeption e) {
            fail("fallodatosinvalidos");
        }
        Assert.assertEquals(false, result);
    }



    @Test
    public void menorEdad9() {
        Person person = new Person("Felipe", 102, -100, MALE, true);
        boolean result = false;
        try {
            result = prueba.registerVoter(person);
            fail("no fallo");
        } catch (detectorEdadExeption e) {
            Assert.assertEquals(detectorEdadExeption.EDAD_INVALIDA, e.getMessage());
        }

    }
}