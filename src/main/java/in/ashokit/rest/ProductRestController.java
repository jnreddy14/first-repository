package in.ashokit.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import in.ashokit.binding.Product;
import in.ashokit.service.ProductService;
import jakarta.websocket.server.PathParam;

public class ProductRestController {

	private ProductService service;
		
		public ResponseEntity<String> addProduct(@RequestBody Product product){
			
			String msg = service.addProduct(product);
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		
	}
		public ResponseEntity<List<Product>> getProduct(){
		List<Product> product = service.getProduct();
		return new ResponseEntity<>(product, HttpStatus.OK);
		}
		
		public ResponseEntity<String>(@PathVariable Integer pid){
			String msg = service.deleteBook(pid);
			return new ResponseEntity<>(msg, HttpStatus.OK);
		}
		
}
