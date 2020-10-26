package co.com.projectwongweb.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyCartPage {

    public static Target PRODUCT_ADDED_NAME = Target.the("product added name").locatedBy("//a[contains(text(),'{0}')]");
}
