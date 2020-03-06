package lesson4.userloginservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserLoginServiceTest {

    @Test
    void login() {

        UserLoginService serviceTest = new UserLoginService();
        User userTestOne = new User("TEST_USER", "TEST_PASSWORD");

        assertTrue(serviceTest.login(userTestOne, "TEST_PASSWORD"));
    }

    @Test
    void login_userIsBlocked() {

        UserLoginService serviceTest = new UserLoginService();
        User userTestTwo = new User("TEST_USER", "TEST_PASSWORD");

        serviceTest.login(userTestTwo, "TEST_INCORRECT"); //Should return false
        serviceTest.login(userTestTwo, "TEST_INCORRECT"); //Should return false

        assertTrue(serviceTest.login(userTestTwo, "TEST_INCORRECT"));
    }

    @Test
    void login_userIsNotBlocked() {

        UserLoginService serviceTest = new UserLoginService();
        User userTestTwo = new User("TEST_USER", "TEST_PASSWORD");

        serviceTest.login(userTestTwo, "TEST_INCORRECT"); //Should return false

        assertTrue(serviceTest.login(userTestTwo, "TEST_INCORRECT"));
    }
}