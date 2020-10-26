package co.com.projectwongweb.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage {

    public static Target BUTTON_ADD_PRODUCT = Target.the("button add product").locatedBy("//span[@class='product-add-to-cart__text desktop']");

    public static Target BUTTON_ADD_QUANTITY= Target.the("button add quantity").locatedBy("//div[@class='is-available']/div/div/div/button[@class='product-quantity__control product-quantity__control--increase font-icn plus']");

    public static Target BUTTON_CLOSE_ALERT_PRODUCT_ADDED= Target.the("button close alert product added").locatedBy("//button[@class='modal-address__close font-icn cross']");

    public static Target BUTTON_NO_THANKS = Target.the("button no thanks").locatedBy("//button[@id='onesignal-slidedown-cancel-button']");
}
