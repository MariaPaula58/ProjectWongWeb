package co.com.projectwongweb.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDismiss implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), 5 /*timeout in seconds*/);

        if(wait.until(ExpectedConditions.alertIsPresent())!=null){
            Alert alerts = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
            alerts.accept();
        }
    }

    public static AlertDismiss toDismiss(){

        return new AlertDismiss();
    }
}
