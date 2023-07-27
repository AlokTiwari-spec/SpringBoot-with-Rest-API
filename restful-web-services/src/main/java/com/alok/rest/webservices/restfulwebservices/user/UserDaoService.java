package com.alok.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	private static int userCounts = 0;
	
	static {
		users.add(new User (++userCounts,"Alok", LocalDate.now().minusYears(28)));
		users.add(new User (++userCounts,"Aniket", LocalDate.now().minusYears(20)));
		users.add(new User (++userCounts,"Akriti", LocalDate.now().minusYears(19)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
	
	public User save(User user) {
		user.setId(++userCounts);
		users.add(user);
		return user;
	}
}
