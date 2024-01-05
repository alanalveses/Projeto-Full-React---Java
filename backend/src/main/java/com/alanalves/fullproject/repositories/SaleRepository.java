package com.alanalves.fullproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanalves.fullproject.entities.Heroi;

public interface SaleRepository extends JpaRepository<Heroi, Long>{

}
