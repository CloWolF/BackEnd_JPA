package com.example.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Comuna;

public interface ComunaRepository   extends JpaRepository<Comuna, Long> {
	Void save(Optional<Comuna> ComunaToUpdate);

}
