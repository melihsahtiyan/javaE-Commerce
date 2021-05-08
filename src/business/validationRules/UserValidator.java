package business.validationRules;

import entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public boolean userValidator(User user){
        boolean[] logics={emailIsValid(user),passwordIsValid(user),nameIsInvalid(user)};
        for (boolean logic:logics) {
            if (logic!=true)
                return false;
        }
        return true;
    }

    public boolean emailIsValid(User user){

        String form = "^(.+)@(gmail.com)$";

        Pattern pattern = Pattern.compile(form);

        Matcher matcher = pattern.matcher(user.getEmail());

        return matcher.matches();
    }

    public boolean passwordIsValid(User user){
        if (user.getPassword().length()<6)
            return false;
        return true;
    }

    public boolean nameIsInvalid(User user) {
        if (user.getFistName().length() < 2 && user.getLastName().length() < 2)
            return false;
        return true;
    }
}
