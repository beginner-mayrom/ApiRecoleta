package br.com.recoleta.app.users;


import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User implements UserDetails{
	
	@Id
	@SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
	private Long  id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String cpfCnpj;
	private String fone;
	@Enumerated(EnumType.STRING)
	private UserType type;

	//private UserRole userRole;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return null;
		
		//SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRole.name());
		//return Collections.singletonList(authority);
	}


	@Override
	public String getUsername() {
		return email;
	}
	
	@Override
	public String getPassword() {
		return password;
	}


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}


	public User(String firstName, String lastName, String email, String password, String cpfCnpj, String fone, UserType type) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.cpfCnpj = cpfCnpj;
		this.fone = fone;
		this.type = type;
	}

}
