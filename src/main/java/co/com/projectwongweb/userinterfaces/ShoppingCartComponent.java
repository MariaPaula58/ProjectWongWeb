package co.com.projectwongweb.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartComponent {

    public static Target BUTTON_SEE_CART = Target.the("button see cart").locatedBy("//div[@class='minicart minicart--navigation box-shadow-2 food-site minicart--single-category to-list-button minicart--has-items minicart--open anim--panDown']/div[@class='minicart__body custom-minicart-body']/div[@class='minicart__items-wrapper']/a");
}
