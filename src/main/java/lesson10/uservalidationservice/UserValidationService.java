package lesson10.uservalidationservice;

public class UserValidationService {

    void validate(User user) {
        if (user.getFirstName() == null) {
            throw new UserValidationException("First name should not be null");
        }

        if (user.getLastName() == null) {
            throw new UserValidationException("Last name should not be null");
        }

        if (user.getFirstName().length() < 3 || user.getLastName().length() < 3) {
            throw new UserValidationException("Name or last name should not be shorter than 3 letters.");
        }

        if (user.getFirstName().length() > 15 || user.getLastName().length() > 15) {
            throw new UserValidationException("Name or last name should not be longer than 15 letters.");
        }

        if (user.getAge() < 0) {
            throw new UserValidationException("Age can't be negative value.");
        }

        if (user.getAge() >= 120) {
            throw new UserValidationException("Age should not be over 120 years");
        }
    }
}
