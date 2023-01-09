package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null
                || password.compareTo(repeatPassword) != 0 | password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
