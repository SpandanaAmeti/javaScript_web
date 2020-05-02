package com.capg.placeorder.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "rawmaterialorderd")
public class RawMaterialOrderDetails {
	
	@Id
	@Column(length=5)
	private int orderId;
	@Column(length=25)
    private String name;
	@Column(length=10)
	private int quantityUnit;
	@Column(length=10)
	private double pricePerUnit;
	@Column(length=10)
    private double totalPrice;
	@Column(length=20)
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date dateOfOrder;
	@Column(length=20)
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date dateOfDelivery;
	@Column(length=25)
	private String deliveryStatus;
	private int supplierId;
	
	public RawMaterialOrderDetails() {
		super();
	}

	public RawMaterialOrderDetails(int orderId, String name, int quantityUnit, double pricePerUnit, double totalPrice,
			Date dateOfOrder, Date dateOfDelivery, String deliveryStatus,int supplierId) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.quantityUnit = quantityUnit;
		this.pricePerUnit = pricePerUnit;
		this.totalPrice = totalPrice;
		this.dateOfOrder = dateOfOrder;
		this.dateOfDelivery = dateOfDelivery;
		this.deliveryStatus = deliveryStatus;
		this.supplierId = supplierId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}

	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	
	
}
