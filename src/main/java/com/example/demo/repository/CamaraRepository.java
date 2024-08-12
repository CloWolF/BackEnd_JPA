package com.example.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Camara;

public interface CamaraRepository   extends JpaRepository<Camara, Long> {
	Void save(Optional<Camara> CamaraToUpdate);

}
