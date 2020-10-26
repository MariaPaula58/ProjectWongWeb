package co.com.projectwongweb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;


public class VisibilityOfElement implements Question {


    private Target target;

    public VisibilityOfElement(Target target){
        this.target = target;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Visibility.of(target).viewedBy(actor).asBoolean();
    }

    public static VisibilityOfElement asBoolean(Target target){
        return new VisibilityOfElement(target);
    }
}
