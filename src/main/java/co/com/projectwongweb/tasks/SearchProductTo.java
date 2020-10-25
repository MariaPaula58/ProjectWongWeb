package co.com.projectwongweb.tasks;

import co.com.projectwongweb.models.Product;
import co.com.projectwongweb.userinterfaces.ProductContainerPage;
import co.com.projectwongweb.userinterfaces.TopMenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class SearchProductTo implements Task {

    private Product product;

    public  SearchProductTo(Product product){
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(
                Enter.theValue(product.getName()).into(TopMenuComponent.INPUT_SEARCH).thenHit(Keys.ENTER),
                Click.on(ProductContainerPage.DIV_PRODUCT.of(product.getName()))
        );
    }

    public static SearchProductTo theListProduct(Product product){
        return new SearchProductTo(product);
    }
}
