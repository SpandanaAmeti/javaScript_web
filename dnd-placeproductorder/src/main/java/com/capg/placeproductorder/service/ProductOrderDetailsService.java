package com.capg.placeproductorder.service;

import java.util.List;
import java.util.Optional;

import com.capg.placeproductorder.model.ProductOrderDetails;

public interface ProductOrderDetailsService {

	ProductOrderDetails addProductOrder(ProductOrderDetails product);
    
    List<ProductOrderDetails>getAllProductDetails();
    
    Optional<ProductOrderDetails> getProductOrderDetailsById(int orderId);
    
    void deleteProductOrder(int orderId);
  
    ProductOrderDetails updateproductorder(ProductOrderDetails product);
}
