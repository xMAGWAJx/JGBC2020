package lesson04.userloginservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {

    @Test
    void getLogin() {

        UserLoginService serviceTest = new UserLoginService();
        User userTestOne = new User("TEST_USER", "TEST_PASSWORD");

        String expectedResult = "TEST_USER";
        String actualResult = userTestOne.getLogin();

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getPassword() {

        UserLoginService serviceTest = new UserLoginService();
        User userTestTwo = new User("TEST_USER", "TEST_PASSWORD");

        String expectedResult = "TEST_PASSWORD";
        String actualResult = userTestTwo.getPassword();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void isUserIsBlocked() {

        UserLoginService serviceTest = new UserLoginService();
        User userTestThree = new User("TEST_USER", "TEST_PASSWORD");

        serviceTest.login(userTestThree, "TEST_INCORRECT");
        serviceTest.login(userTestThree, "TEST_INCORRECT");

        assertTrue(serviceTest.login(userTestThree, "TEST_INCORRECT"));
    }

    @Test
    void getNumberOfAttempts() {

        UserLoginService serviceTest = new UserLoginService();
        User userTestFour = new User("TEST_USER", "TEST_PASSWORD");

        serviceTest.login(userTestFour, "TEST_INCORRECT");

        assertEquals(2, userTestFour.getNumberOfAttempts());
    }

    @Test
    void decreaseAmountOfAttempts() {

        UserLoginService serviceTest = new UserLoginService();
        User userTestFive = new User("TEST_USER", "TEST_PASSWORD");

        userTestFive.decreaseAmountOfAttempts();

        assertEquals(2, userTestFive.getNumberOfAttempts());
    }

    @Test
    void resetNumberOfAttempts() {

        UserLoginService serviceTest = new UserLoginService();
        User userTestSix = new User("TEST_USER", "TEST_PASSWORD");

        serviceTest.login(userTestSix, "TEST_INCORRECT");
        serviceTest.login(userTestSix, "TEST_INCORRECT");

        userTestSix.resetNumberOfAttempts();

        assertEquals(3, userTestSix.getNumberOfAttempts());
    }

    @Test
    void blockUser() {

        UserLoginService serviceTest = new UserLoginService();
        User userTestSeven = new User("TEST_USER", "TEST_PASSWORD");

        serviceTest.login(userTestSeven, "TEST_INCORRECT");
        serviceTest.login(userTestSeven, "TEST_INCORRECT");
        serviceTest.login(userTestSeven, "TEST_INCORRECT");

        assertTrue(userTestSeven.isUserIsBlocked());
    }
}