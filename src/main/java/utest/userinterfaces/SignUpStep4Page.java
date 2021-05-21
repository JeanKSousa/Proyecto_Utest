package utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep4Page {
    public static final Target IMPUT_PASSWORD = Target.the("write the password")
            .located(By.id("password"));
    public static final Target IMPUT_PASSWORD2 = Target.the("write the password again")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY = Target.the("we check 1")
            .located(By.xpath("//div[@class='signup-consent__text--highlight']"));
    public static final Target CHECK_TERMS = Target.the("we check 1")
            .located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACY = Target.the("we check 2")
            .located(By.id("privacySetting"));
}
