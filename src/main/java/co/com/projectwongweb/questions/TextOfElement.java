package co.com.projectwongweb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class TextOfElement implements Question {


    private Target target;

    public TextOfElement(Target target){
        this.target = target;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }

    public static TextOfElement asText(Target target){
        return new TextOfElement(target);
    }
}
