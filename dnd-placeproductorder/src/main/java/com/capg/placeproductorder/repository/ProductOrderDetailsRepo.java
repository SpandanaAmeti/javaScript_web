package com.capg.placeproductorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.placeproductorder.model.ProductOrderDetails;



public interface ProductOrderDetailsRepo extends JpaRepository<ProductOrderDetails, Integer> {

	
}
