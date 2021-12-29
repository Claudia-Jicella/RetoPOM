package co.com.despegar.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/reserva_vuelos.feature"},
        glue =  {"co.com.stepdefinition"},
        tags = "not @ignore",
        publish = true
)
public class VueloReservaTestCucumber {

}
