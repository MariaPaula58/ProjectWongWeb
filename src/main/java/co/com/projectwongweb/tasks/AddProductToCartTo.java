package co.com.projectwongweb.tasks;

import co.com.projectwongweb.interactions.Wait;
import co.com.projectwongweb.models.Product;
import co.com.projectwongweb.userinterfaces.ShoppingCartComponent;
import co.com.projectwongweb.userinterfaces.ShoppingCartPage;
import co.com.projectwongweb.userinterfaces.TopMenuComponent;
import co.com.projectwongweb.utils.Convert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class AddProductToCartTo implements Task {

    private Product product;
    String quantity;

    public AddProductToCartTo(Product product){
        this.product= product;
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
                Click.on(ShoppingCartPage.BUTTON_NO_THANKS),
                Click.on(ShoppingCartPage.BUTTON_CLOSE_ALERT_PRODUCT_ADDED),
                Click.on(TopMenuComponent.ICON_BUTTON_CART),
                Wait.segundos(3),
                Click.on(ShoppingCartComponent.BUTTON_SEE_CART)
        );

    }

    public static AddProductToCartTo anAddedAlert(Product product){

        return  new AddProductToCartTo(product);
    }
}
