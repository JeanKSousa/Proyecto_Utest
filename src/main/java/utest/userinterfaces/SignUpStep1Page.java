package utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep1Page {
    public static final Target SIGNUP_BUTTON = Target.the("button that shows us the form to signup")
            .located(By.xpath("//a[contains(text(), 'Join Today')]"));
    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the firstname")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the user lastaname")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where do we select the birth month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("where do we select the birth day")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("where do we select the birth year")
            .located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("button that shows us the next step")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a"));
}
