package co.com.projectwongweb.interactions;

import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts implements Interaction {

    private WebDriver myDriver;

    public  Alerts(WebDriver myDriver){
        this.myDriver = myDriver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Alert alert = myDriver.switchTo().alert();
        alert.dismiss();
    }


    public static Alerts anAlert(WebDriver myDriver){

        return new Alerts(myDriver);
    }
}
