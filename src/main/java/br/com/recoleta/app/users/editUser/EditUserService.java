package br.com.recoleta.app.users.editUser;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.recoleta.app.users.User;
import br.com.recoleta.app.users.UserRepository;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class EditUserService {
	
	private final UserRepository userRepository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	
	/*
	 * altera todos os valores
	 * 
	public Optional<User> edit(Long id, User user) {
		
		Optional<User> Userfound = userRepository.findById(id);
		
		if(Userfound.isPresent()) {
		
			Userfound.get().setFirstName(user.getFirstName());
			Userfound.get().setLastName(user.getLastName());
			//Userfound.get().setEmail(user.getEmail());
			//Userfound.get().setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			Userfound.get().setCpfCnpj(user.getCpfCnpj());
			Userfound.get().setFone(user.getFone());
			//Userfound.get().setUserRole(user.getUserRole());
			//Userfound.get().setType(user.getType());
			
			User saved = userRepository.save(Userfound.get());
			return Optional.of(saved);
		}
		return Optional.empty();
	}
	*/
	
	public Optional<User> edit(Long id, User user) {
	    Optional<User> userFound = userRepository.findById(id);

	    if (userFound.isPresent()) {
	        User existingUser = userFound.get();

	        // Verificar e atualizar as propriedades que foram fornecidas no objeto 'user'
	        if (user.getFirstName() != null) {
	            existingUser.setFirstName(user.getFirstName());
	        }
	        if (user.getLastName() != null) {
	            existingUser.setLastName(user.getLastName());
	        }
	        if (user.getCpfCnpj() != null) {
	            existingUser.setCpfCnpj(user.getCpfCnpj());
	        }
	        if (user.getFone() != null) {
	            existingUser.setFone(user.getFone());
	        }
	       
	        if(user.getType() != null) {
	        	existingUser.setType(user.getType());
	        }
	        
	        if(user.getPassword() != null) {
	        	existingUser.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	        }

	        // Salvar o usuário atualizado
	        User saved = userRepository.save(existingUser);
	        return Optional.of(saved);
	    }
	    return Optional.empty();
	}


}
