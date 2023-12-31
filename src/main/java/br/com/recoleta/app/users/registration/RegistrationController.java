package br.com.recoleta.app.users.registration;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/registration")
@AllArgsConstructor
public class RegistrationController {
	
	private final registrationService registrationService;
	
	@PostMapping
	public String register (@RequestBody RegistrationRequest request) {
		return registrationService.register(request);
	}

}
