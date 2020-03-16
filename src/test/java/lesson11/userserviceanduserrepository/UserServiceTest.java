package lesson11.userserviceanduserrepository;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private UserService victim;
    private MockUserRepository mockUserRepositoryDataBase;

    @BeforeEach
    public void setUp() {
        this.mockUserRepositoryDataBase = new MockUserRepository();
        this.victim = new UserService(mockUserRepositoryDataBase);
    }

    @Test
    void addUser_ShouldReturnTrue() {
        victim.addUser(new User("TestName", 20));
        assertTrue(mockUserRepositoryDataBase.isMockTriggered);
    }
}