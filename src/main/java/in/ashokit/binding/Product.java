package in.ashokit.binding;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Product_details")
public class Product {

	
	@Id
	@Column(name="product_id")
	private Integer pid;
	
	@Column(name="product_name")
	private String pname;
	
	@Column(name="product_price")
	private Double price;
}
