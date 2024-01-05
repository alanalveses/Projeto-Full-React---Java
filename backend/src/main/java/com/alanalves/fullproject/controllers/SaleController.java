package com.alanalves.fullproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alanalves.fullproject.entities.Heroi;
import com.alanalves.fullproject.services.SaleService;

@RestController
@RequestMapping(value = "/herois")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public List<Heroi> findSales() {
		return service.findSales();
		
		
	}

}
