package com.example.demo.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Void save(Optional<Usuario> usuarioToUpdate);

	Optional<Usuario> findByUsuario(String usuario);
	
	Optional<Usuario> findByUsuarioAndPass(String usuario, String pass);


}
