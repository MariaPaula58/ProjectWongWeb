package co.com.projectwongweb.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TopMenuComponent {

    public static Target INPUT_SEARCH = Target.the("input search").locatedBy("//input[@id='search-autocomplete-input']");

    public static Target ICON_BUTTON_CART = Target.the("icon button cart").locatedBy("//button[@class='btn red minicart__action--toggle-open food-site active']");
}
