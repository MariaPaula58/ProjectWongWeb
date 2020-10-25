package co.com.projectwongweb.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductContainerPage {

    public static Target DIV_PRODUCT = Target.the("div product").locatedBy("//div[@class='product-item__info']/a[contains(text(),'{0}')]");
}
