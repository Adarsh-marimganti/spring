package productapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import productapp.model.Product;

public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public void save(Product product) {
		hibernateTemplate.saveOrUpdate(product);		
	}

	@Override
	public Product getProduct(int pId) {
		Product p = (Product) hibernateTemplate.get(Product.class,pId);
		return p;
	}

	@Override
	public void deleteProduct(int pId) {
		Product p = hibernateTemplate.load(Product.class,pId);
		hibernateTemplate.delete(p);
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products = hibernateTemplate.loadAll(Product.class);
		return products;
	}

}
