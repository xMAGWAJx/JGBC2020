package lesson10.uservalidationservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserValidationServiceTest {

    @Test
    void validate_firstNameNull() {
        UserValidationService userValidationService = new UserValidationService();
        User testUser = new User(null, "lastNameTest", 18);

        Assertions.assertThrows(UserValidationException.class, () -> userValidationService.validate(testUser));
    }

    @Test
    void validate_LastNameNull() {
        UserValidationService userValidationService = new UserValidationService();
        User testUser = new User("TestName", null, 18);

        Assertions.assertThrows(UserValidationException.class, () -> userValidationService.validate(testUser));
    }

    @Test
    void validate_NegativeAge() {
        UserValidationService userValidationService = new UserValidationService();
        User testUser = new User("TestName", "TestLatsName", -100);

        Assertions.assertThrows(UserValidationException.class, () -> userValidationService.validate(testUser));
    }

    @Test
    void validate_AgeOver120() {
        UserValidationService userValidationService = new UserValidationService();
        User testUser = new User("TestName", "TestLatsName", 150);

        Assertions.assertThrows(UserValidationException.class, () -> userValidationService.validate(testUser));
    }

    @Test
    void validate_FirstNameLessThan3() {
        UserValidationService userValidationService = new UserValidationService();
        User testUser = new User("12", "TestLatsName", 25);

        Assertions.assertThrows(UserValidationException.class, () -> userValidationService.validate(testUser));
    }

    @Test
    void validate_LastNameLessThan3() {
        UserValidationService userValidationService = new UserValidationService();
        User testUser = new User("TestName", "12", 25);

        Assertions.assertThrows(UserValidationException.class, () -> userValidationService.validate(testUser));
    }

    @Test
    void validate_FistNameMoreThan15() {
        UserValidationService userValidationService = new UserValidationService();
        User testUser = new User("1234567890123456", "TestLastName", 25);

        Assertions.assertThrows(UserValidationException.class, () -> userValidationService.validate(testUser));
    }

    @Test
    void validate_LastNameMoreThan15() {
        UserValidationService userValidationService = new UserValidationService();
        User testUser = new User("TestName", "1234567890123456", 25);

        Assertions.assertThrows(UserValidationException.class, () -> userValidationService.validate(testUser));
    }
}