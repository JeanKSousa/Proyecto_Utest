package utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResigterButton {
    public static  final Target WELLCOME_MESSAGE = Target.the("Search wellcome message")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
}
