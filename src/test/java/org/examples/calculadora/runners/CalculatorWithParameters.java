package org.examples.calculadora.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/calculator_with_parameters.feature",
        glue = "org.examples.calculadora.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CalculatorWithParameters {
}
