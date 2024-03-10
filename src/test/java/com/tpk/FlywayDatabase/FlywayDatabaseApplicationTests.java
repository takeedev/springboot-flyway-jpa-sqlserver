package com.tpk.FlywayDatabase;

import com.tpk.FlywayDatabase.UserDto.UsersDtoTest;
import com.tpk.FlywayDatabase.dao.UsersDao;
import com.tpk.FlywayDatabase.repository.UsersRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlywayDatabaseApplicationTests {

	private UsersDtoTest data;
	private long userID;

	@Autowired
	private UsersRepository usersRepository;

	@BeforeEach
	public void mockDataForTest() {
		data = UsersDtoTest.builder()
				.username("char")
				.password("charPass")
				.email("char@gmail")
				.build();
	}

	@Test
	public void findByUsername() {
		UsersDao copy = new UsersDao();
		System.out.println(data);
		BeanUtils.copyProperties(data, copy);
		usersRepository.save(copy);

		UsersDao results = usersRepository.findByUsername(data.username());
		userID = results.getUserID();

		Assertions.assertEquals(data.username(), results.getUsername());
	}

	@AfterEach
	public void deleteAfterTestIsSuccess() {
		usersRepository.deleteById(userID);
	}
}
