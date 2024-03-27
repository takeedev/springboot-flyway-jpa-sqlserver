package com.tpk.FlywayDatabase;

import com.tpk.FlywayDatabase.UserDto.UsersDtoTest;
import com.tpk.FlywayDatabase.dao.UsersDao;
import com.tpk.FlywayDatabase.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@RequiredArgsConstructor
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

	@Test
	public void findAllNotNull() {
		List<UsersDao> result = usersRepository.findAll();
		Assertions.assertNotNull(result);
	}

	@Test
	public void insertIsSuccess() {
		UsersDao usersDao = new UsersDao(
				data.userID(),
				data.username(),
				data.email(),
				data.password()
		);
		UsersDao result = usersRepository.save(usersDao);
		Assertions.assertNotNull(result);

		// delete
		if (result != null) {
			usersRepository.deleteById((long) result.getUserID());
		}
	}

	@AfterEach
	public void deleteAfterTestIsSuccess() {
		usersRepository.deleteById(userID);
	}
}
