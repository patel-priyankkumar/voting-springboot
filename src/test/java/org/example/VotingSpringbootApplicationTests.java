package org.example;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VotingSpringbootApplicationTests {

	@Test
	void contextLoads() throws Exception {
		EnrollAdmin.main(null);
		RegisterUser.main(null);
		//ClientApp.main(null);
	}

}
