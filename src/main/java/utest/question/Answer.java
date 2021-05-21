package utest.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utest.model.UserData;

import java.util.List;

public class Answer implements Question<Boolean> {
    List<UserData> userData;
    public Answer(List<UserData> userData) {
        this.userData = userData;
    }
    public static Answer toThe(List<UserData> userData) {
        return new Answer(userData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = "Complete Setup";
        if (userData.get(0).getStrQuestion().equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}