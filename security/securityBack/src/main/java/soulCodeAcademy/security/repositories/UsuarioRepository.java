package soulCodeAcademy.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import soulCodeAcademy.security.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	Optional<Usuario> findByEmail(String email);
}
