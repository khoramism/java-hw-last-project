package src.models;
import src.models.Product;
import models.User;


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