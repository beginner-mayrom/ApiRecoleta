package br.com.recoleta.app.users.getUser;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recoleta.app.users.User;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class GetUserController {
	
	private final GetUserService getUserService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getUser(@PathVariable Long id) {
		
		Optional<User> userExists = getUserService.findUser(id);
		
		if(userExists.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(userExists.get());
	}

}
