package co.com.projectwongweb.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartComponent {

    public static Target BUTTON_SEE_CART = Target.the("button see cart").locatedBy("//div[@class='minicart__body custom-minicart-body']/div[@class='minicart__items-wrapper']/a/span[contains(text(),'Ver')]");

}
