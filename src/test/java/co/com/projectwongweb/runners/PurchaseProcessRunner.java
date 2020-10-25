package co.com.projectwongweb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\purchase_process.feature",
        glue="co.com.projectwongweb.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)

public class PurchaseProcessRunner {
}
