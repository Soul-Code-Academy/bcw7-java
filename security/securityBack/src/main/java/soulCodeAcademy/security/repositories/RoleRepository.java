package soulCodeAcademy.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import soulCodeAcademy.security.models.Role;

public interface RoleRepository extends JpaRepository<Role,Integer>{
	Optional<Role> findByNome(String nome);
}
