package utest.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import utest.userinterfaces.SignUpStep3Page;

public class SignUpStep3 implements Task {
    public static SignUpStep3 onThePageStep3() {
        return Tasks.instrumented(SignUpStep3.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignUpStep3Page.NEXT_BUTTON)
        );
    }
}
