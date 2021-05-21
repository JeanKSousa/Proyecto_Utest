package utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep3Page {
    public static final Target NEXT_BUTTON = Target.the("button that shows us the next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
}
