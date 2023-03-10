package com.pe.prueba.cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"}, glue = {"com.pe.prueba.cucumber.steps"},
        plugin = {"json:target/build/cucumber.json"})
public class CucumberTestSuite {
}
