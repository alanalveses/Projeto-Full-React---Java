package com.alanalves.fullproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alanalves.fullproject.entities.Heroi;
import com.alanalves.fullproject.repositories.SaleRepository;

@Service
public class SaleService {
	@Autowired
	private SaleRepository repository;
	
	public List<Heroi> findSales() {
		return repository.findAll();
		
	}
}
