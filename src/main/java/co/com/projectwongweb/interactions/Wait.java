package co.com.projectwongweb.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {

    private int segundos;

    public Wait(int segundos) {
        this.segundos = segundos;
    }

    public static Wait segundos(int segundos) {
        return Tasks.instrumented(Wait.class, segundos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor((segundos * 1000));
    }
}
