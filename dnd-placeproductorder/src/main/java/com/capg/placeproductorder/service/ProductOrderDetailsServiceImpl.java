package com.capg.placeproductorder.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.placeproductorder.model.ProductOrderDetails;
import com.capg.placeproductorder.repository.ProductOrderDetailsRepo;

@Service
@Transactional
public class ProductOrderDetailsServiceImpl implements ProductOrderDetailsService {

	@Autowired
	ProductOrderDetailsRepo repo;
	
	@Override
	public ProductOrderDetails addProductOrder(ProductOrderDetails product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public List<ProductOrderDetails> getAllProductDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<ProductOrderDetails> getProductOrderDetailsById(int orderId) {
		// TODO Auto-generated method stub
		return repo.findById(orderId);
	}

	@Override
	public void deleteProductOrder(int orderId) {
		// TODO Auto-generated method stub
		repo.deleteById(orderId);
	}

	@Override
	public ProductOrderDetails updateproductorder(ProductOrderDetails product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}


}