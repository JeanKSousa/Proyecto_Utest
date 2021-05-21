package utest.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utest.model.UserData;
import utest.userinterfaces.SignUpStep2Page;

import java.util.List;

public class SignUpStep2 implements Task {
    List<UserData> userData;
    public SignUpStep2(List<UserData> userData) {
        this.userData = userData;
    }
    public static SignUpStep2 onThePageStep2(List<UserData> userData) {
        return Tasks.instrumented(SignUpStep2.class, userData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userData.get(0).getStrCity()).into(SignUpStep2Page.INPUT_CITY),
                Click.on(SignUpStep2Page.INPUT_POSTAL),
                Enter.theValue(userData.get(0).getStrPostal()).into(SignUpStep2Page.INPUT_POSTAL),
                Click.on(SignUpStep2Page.INPUT_POSTAL),
                Click.on(SignUpStep2Page.NEXT_BUTTON)
        );
    }
}
