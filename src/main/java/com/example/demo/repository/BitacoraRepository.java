package com.example.demo.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Bitacora;

public interface BitacoraRepository    extends JpaRepository<Bitacora, Long> {
	Void save(Optional<Bitacora> BitacoraToUpdate);
	
	List<Bitacora> findByIdPaciente(Long id);
	
	List<Bitacora> findByIdEnfermero(Long id);
	
	List<Bitacora> findByIdGeriatra(Long id);
}
