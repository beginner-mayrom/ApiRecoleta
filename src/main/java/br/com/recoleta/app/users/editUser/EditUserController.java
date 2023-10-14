package br.com.recoleta.app.users.editUser;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recoleta.app.users.User;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class EditUserController {

	private final EditUserService editUserService;

	@PutMapping("/{id}")
	ResponseEntity<User> edit(@PathVariable Long id, @RequestBody User user) {

		Optional<User> actualUser = editUserService.edit(id, user);

		if(actualUser.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(actualUser.get());
	}
}
