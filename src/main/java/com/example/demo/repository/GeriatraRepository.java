package com.example.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Geriatra;

public interface GeriatraRepository extends JpaRepository<Geriatra, Long> {
	Void save(Optional<Geriatra> geriatraToUpdate);

}
