package utest.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utest.model.UserData;
import utest.userinterfaces.SignUpStep4Page;
import java.util.List;

public class SignUpStep4 implements Task {
    List<UserData> userData;
    public SignUpStep4(List<UserData> userData) {
        this.userData = userData;
    }
    public static SignUpStep4 onThePageStep4(List<UserData> userData) {
        return Tasks.instrumented(SignUpStep4.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userData.get(0).getStrPassword()).into(SignUpStep4Page.IMPUT_PASSWORD),
                Enter.theValue(userData.get(0).getStrPassword()).into(SignUpStep4Page.IMPUT_PASSWORD2),
                Click.on(SignUpStep4Page.CHECK_STAY),
                Click.on(SignUpStep4Page.CHECK_TERMS),
                Click.on(SignUpStep4Page.CHECK_PRIVACY)
        );
    }
}
