package com.example.demo.repository;

//import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Paciente;


public interface PacienteRepository  extends JpaRepository<Paciente, Long> {
	Void save(Optional<Paciente> pacienteToUpdate);
	
	//@Query("Select p from PACIENTE p WHERE p.ap_paterno like :param_apPaterno")
	//public List<Paciente> findPacienteLikeApPaterno(@Param("param_apPaterno") String apPaterno);

}
