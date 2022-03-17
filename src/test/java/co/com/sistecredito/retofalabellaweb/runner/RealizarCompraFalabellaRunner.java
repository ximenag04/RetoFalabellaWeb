package co.com.sistecredito.retofalabellaweb.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\realizar_compra_falabella.feature",
        glue = "co.com.sistecredito.retofalabellaweb.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RealizarCompraFalabellaRunner {
}
