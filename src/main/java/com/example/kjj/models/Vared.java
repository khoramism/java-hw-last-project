package com.example.kjj.models;
import com.example.kjj.models.Product;


import com.example.kjj.models.User;


public class Vared extends models.AuditedModel {
	Product product;
	User user;


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		if (product.isAllowed) {
			this.product = product;
		}
	}




}