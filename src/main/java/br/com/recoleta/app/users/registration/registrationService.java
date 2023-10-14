package br.com.recoleta.app.users.registration;

import org.springframework.stereotype.Service;

import br.com.recoleta.app.users.User;
import br.com.recoleta.app.users.UserRole;
import br.com.recoleta.app.users.UserService;
import br.com.recoleta.app.users.UserType;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class registrationService {
	
	private final UserService userService;
	
	public String register(RegistrationRequest request) {
		
		return userService.signUpUser(new User(
																				request.getFirstName(),
																				request.getLastName(),
																				request.getEmail(),
																				request.getPassword(),
																				request.getCpfCnpj(),
																				request.getFone(),
																				UserRole.USER,
																				UserType.COLLECTS_WASTE
				));
	}

}
