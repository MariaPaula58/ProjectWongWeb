package co.com.projectwongweb.tasks;

import co.com.projectwongweb.interactions.Alerts;
import co.com.projectwongweb.models.Product;
import co.com.projectwongweb.userinterfaces.ShoppingCartComponent;
import co.com.projectwongweb.userinterfaces.ShoppingCartPage;
import co.com.projectwongweb.userinterfaces.TopMenuComponent;
import co.com.projectwongweb.utils.Convert;
import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;


public class AddProductToCartTo implements Task {

    private Product product;
    private WebDriver driver;
    String quantity;

    public AddProductToCartTo(Product product, WebDriver driver){
        this.product= product;
        this.driver=driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        int quantity = Convert.convertStringToInt(product.getQuantity());

        for (int i = 1; i <= (quantity - 1); i++) {

            actor.attemptsTo(

                    Click.on(ShoppingCartPage.BUTTON_ADD_QUANTITY)
            );
        }

        actor.attemptsTo(
                Click.on(ShoppingCartPage.BUTTON_ADD_PRODUCT),
                Click.on(ShoppingCartPage.BUTTON_CLOSE_ALERT_PRODUCT_ADDED),
                Click.on(TopMenuComponent.ICON_BUTTON_CART),
                Click.on(ShoppingCartComponent.BUTTON_SEE_CART)
        );

    }

    public static AddProductToCartTo anAddedAlert(Product product){

        return  new AddProductToCartTo(product);
    }
}
