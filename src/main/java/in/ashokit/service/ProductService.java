package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Product;
import in.ashokit.repository.ProductRepository;

public interface ProductService {
	
	public String addProduct(Product product);
	
	public List<Product> getProduct();
	
	public String deleteProduct(Integer pid);
	
	
}
