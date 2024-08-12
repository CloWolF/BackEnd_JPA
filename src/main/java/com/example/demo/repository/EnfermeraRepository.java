package com.example.demo.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Enfermera;
public interface EnfermeraRepository extends JpaRepository<Enfermera, Long> {
	Void save(Optional<Enfermera> enfermeraToUpdate);

	List<Enfermera> findByApPaterno(String enfermera);

}
