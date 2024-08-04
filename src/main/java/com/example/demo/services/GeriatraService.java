package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Geriatra;

public interface GeriatraService {
	public List<Geriatra> findAllGeriatras();
	public Optional<Geriatra> findGeriatraById(Long id);
	//public Customer saveCustomer(Customer customerNew);
	//public String deleteCustomer(Long id);
	//public String updateCustomer(Customer customerNew);

}
