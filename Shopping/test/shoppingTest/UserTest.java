package shoppingTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import smallStore.User;

class UserTest {
	User user;

	@BeforeEach
	void setUp() throws Exception {
		user = new User();
	}

	@Test
	void test() {
		user.setName("Bisi");
		user.setEmail("");
	}

}
