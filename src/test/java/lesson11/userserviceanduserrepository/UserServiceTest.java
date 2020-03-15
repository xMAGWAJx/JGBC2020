package lesson11.userserviceanduserrepository;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private UserService victim;
    private MockUserRepository mockUserRepositoryDataBase;

    @Before
    public void setUp() {
        victim = new UserService();
        victim.userRepositoryDataBase = new MockUserRepository();
        mockUserRepositoryDataBase = (MockUserRepository) victim.userRepositoryDataBase;
    }

    @Test
    void addUser_ShouldReturnTrue() {
        victim.addUser(new User("TestName", 20));
        assertTrue(mockUserRepositoryDataBase.isMockTriggered);
    }
}