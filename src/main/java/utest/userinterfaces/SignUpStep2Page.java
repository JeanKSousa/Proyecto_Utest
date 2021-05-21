package utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep2Page {
    public static final Target INPUT_CITY = Target.the("where do we write the city name")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL = Target.the("where do we write the postal number")
            .located(By.id("zip"));
    public static final Target NEXT_BUTTON = Target.the("button that shows us the next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
}
