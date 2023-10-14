package br.com.recoleta.app.users;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService{

	private final UserRepository userRepository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		return userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("E-mail não cadastrado."));
	}

	
	public String signUpUser(User user) {
		boolean userExists = userRepository.findByEmail(user.getEmail()).isPresent();

		if(userExists) {
			throw new IllegalStateException("E-mail já registrado.");
		}
		String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);

		userRepository.save(user);

		return "será!?";
	}

}
