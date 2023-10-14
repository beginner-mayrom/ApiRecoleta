package br.com.recoleta.app.users.deleteUser;

import org.springframework.stereotype.Service;

import br.com.recoleta.app.users.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DeleteUserService {
	
	UserRepository userRepository;

	public void delete(Long id) {
	
		userRepository.deleteById(id);
		
	}

}
