package br.com.gx2.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gx2.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {

		User user = new User(1, "Ronaldo Prass", "rprass@gmail.com", "6666", "666");
		return ResponseEntity.ok(user);
	}

}
