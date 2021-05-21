package utest.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import utest.model.UserData;
import utest.userinterfaces.SignUpStep1Page;
import java.util.List;

public class SignUpStep1 implements Task {
    List<UserData> userData;
    public SignUpStep1(List<UserData> userData) {
        this.userData = userData;
    }
    public static SignUpStep1 onThePageStep1(List<UserData> userData){
      return Tasks.instrumented(SignUpStep1.class, userData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignUpStep1Page.SIGNUP_BUTTON),
                Enter.theValue(userData.get(0).getStrFirstName()).into(SignUpStep1Page.INPUT_FIRSTNAME),
                Enter.theValue(userData.get(0).getStrLastName()).into(SignUpStep1Page.INPUT_LASTNAME),
                Enter.theValue(userData.get(0).getStrEmail()).into(SignUpStep1Page.INPUT_EMAIL),
                new SelectByVisibleTextFromTarget(SignUpStep1Page.SELECT_MONTH, userData.get(0).getStrMonth()),
                new SelectByVisibleTextFromTarget(SignUpStep1Page.SELECT_DAY, userData.get(0).getStrDay()),
                new SelectByVisibleTextFromTarget(SignUpStep1Page.SELECT_YEAR, userData.get(0).getStrYear()),
                Click.on(SignUpStep1Page.NEXT_BUTTON)
        );
    }
}
