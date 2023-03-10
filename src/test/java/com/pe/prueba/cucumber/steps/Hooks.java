package com.pe.prueba.cucumber.steps;

import com.pe.prueba.cucumber.utils.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public static void setUp() {
        HelperClass.setUp();
    }

    @After
    public static void tearDown(){
        HelperClass.tearDown();
    }
}
