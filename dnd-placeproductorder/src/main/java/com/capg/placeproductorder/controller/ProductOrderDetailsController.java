package com.capg.placeproductorder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.placeproductorder.exceptions.IdNotFoundException;
import com.capg.placeproductorder.model.ProductOrderDetails;
import com.capg.placeproductorder.service.ProductOrderDetailsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/productorder")
public class ProductOrderDetailsController {
	
	@Autowired
	ProductOrderDetailsService serviceobj;
	
	//Add ProductOrder
	@PostMapping("/addProductOrder")
	public ResponseEntity<String>addProductOrder(@RequestBody ProductOrderDetails product )
	{
		ProductOrderDetails details = serviceobj.addProductOrder(product);
		if(details == null)
		{
			throw new IdNotFoundException("Enter Valid Id");
		}
		else {
			return new ResponseEntity<String>("Product Order placed successfully",new HttpHeaders(),HttpStatus.OK);		
		}
	}

	//Get all ProductOrders
	@GetMapping("/GetAllProductOrders")
	private ResponseEntity<List<ProductOrderDetails>> getAllProductOrders() 
	    {
		List<ProductOrderDetails> productorderlist = serviceobj.getAllProductDetails();
		return new ResponseEntity<List<ProductOrderDetails>>(productorderlist, new HttpHeaders(), HttpStatus.OK);
        }
	

	// Get Particular ProductorderDetail
		@GetMapping("/GetProductOrderDetail/{orderId}")
		private ResponseEntity<Optional<ProductOrderDetails>> getProductOrderDetailsById(@PathVariable("orderId") int orderId) {
			Optional<ProductOrderDetails> details = serviceobj.getProductOrderDetailsById(orderId);
			if (details == null) {
				throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
			} else {
				return new ResponseEntity<Optional<ProductOrderDetails>>(details, new HttpHeaders(), HttpStatus.OK);
			}
		}
	
    //Update ProductOrder
    @PutMapping("/UpdateProductOrder")
	public ResponseEntity<String> updateProductOrder(@RequestBody ProductOrderDetails product)
		{
			ProductOrderDetails details = serviceobj.updateproductorder(product);
			if (details == null) {
				throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
			} else {
				return new ResponseEntity<String>("Product Order updated successfully", new HttpHeaders(), HttpStatus.OK);
			}
		}
		
	// Delete ProductOrder
	@DeleteMapping("/DeleteProductOrder/{orderId}")
	private ResponseEntity<String> deleteProductOrder(@PathVariable("orderId") int orderId)
		{
			    serviceobj.deleteProductOrder(orderId);
				return new ResponseEntity<String>("Product Order deleted successfully", new HttpHeaders(), HttpStatus.OK);
			
		}
	}

