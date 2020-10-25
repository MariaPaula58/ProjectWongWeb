package co.com.projectwongweb.stepdefinitions;

import co.com.projectwongweb.models.Product;
import co.com.projectwongweb.tasks.AddProductToCartTo;
import co.com.projectwongweb.tasks.SearchProductTo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class PurchaseProcessStepdefition {

    @Managed
    private WebDriver myDriver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(myDriver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.wong.pe/especiales/cyberwong"));
    }



    @Given("^the user searches a product$")
    public void theUserSearchesAProduct(List<Product> listProduct) {

        OnStage.theActorInTheSpotlight().wasAbleTo(SearchProductTo.theListProduct(listProduct.get(0)));
    }

    @When("^the user adds a product to the shopping cart$")
    public void theUserAddsAProductToTheShoppingCart(List<Product> listProduct) {

        OnStage.theActorInTheSpotlight().attemptsTo(AddProductToCartTo.anAddedAlert(listProduct.get(0)));
    }

    @Then("^the user sees added product$")
    public void theUserSeesAddedProduct() {

    }
}
