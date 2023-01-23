package co.com.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/avianca.feature",
        glue = "co.com.certification.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class AviancaRunner {
}
