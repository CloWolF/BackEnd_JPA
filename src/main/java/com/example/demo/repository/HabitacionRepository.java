package com.example.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Habitacion;

public interface HabitacionRepository  extends JpaRepository<Habitacion, Long> {
	Void save(Optional<Habitacion> HabitacionToUpdate);

}
