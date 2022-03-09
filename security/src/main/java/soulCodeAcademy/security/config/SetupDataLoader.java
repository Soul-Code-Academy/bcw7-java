package soulCodeAcademy.security.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import soulCodeAcademy.security.models.Role;
import soulCodeAcademy.security.models.Usuario;
import soulCodeAcademy.security.repositories.RoleRepository;
import soulCodeAcademy.security.repositories.UsuarioRepository;

@Configuration
public class SetupDataLoader implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Usuario Ana = new Usuario("Ana", "Lucia", "ana@gmail.com");
		Usuario Edilson = new Usuario("Edilson", "Miguel", "edilson@gmail.com");
		
		createUserIfNotFound(Ana);
		createUserIfNotFound(Edilson);
		
		Role roleAdmin = createRoleIfNotFound("ROLE_ADMIN");
		Role roleUser = createRoleIfNotFound("ROLE_USER");
		
	}

	private Usuario createUserIfNotFound(Usuario usuario) {
		Optional<Usuario> usuObj = usuarioRepository.findByEmail(usuario.getEmail());
			if(usuObj.isPresent()) {
				return usuObj.get();
			}
			return usuarioRepository.save(usuario);
		}
		
	private Role createRoleIfNotFound(String nome) {
		Optional<Role> roleObj = roleRepository.findByNome(nome);
			if(roleObj.isPresent()) {
				return roleObj.get();
			}
			return roleRepository.save(new Role(nome));
		}
	
}
