package productapp.dao;

import java.util.List;

import productapp.model.Product;

public interface ProductDao {
	void save(Product product);
	Product getProduct(int id);
	void deleteProduct(int id);
	List<Product> getProducts();
}
