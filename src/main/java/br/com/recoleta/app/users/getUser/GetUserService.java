package br.com.recoleta.app.users.getUser;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.recoleta.app.users.User;
import br.com.recoleta.app.users.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GetUserService {
	
	private final UserRepository userRepository;

	public Optional<User> findUser(Long id) {
		return userRepository.findById(id);
	}

}
