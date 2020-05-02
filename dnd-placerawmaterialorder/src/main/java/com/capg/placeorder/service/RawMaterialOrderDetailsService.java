package com.capg.placeorder.service;

import java.util.List;
import java.util.Optional;

import com.capg.placeorder.model.RawMaterialOrderDetails;


public interface RawMaterialOrderDetailsService
{

	RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r);

	List<RawMaterialOrderDetails> getAllRawMaterialOrders();
//	Optional<SupplierDetails> getSuplierDetails(int orderId);

	Optional<RawMaterialOrderDetails> getRawMaterialOrderDetailById(int orderId);
	
	void deleteRawMaterialOrder(int orderId);

	RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r);
}
