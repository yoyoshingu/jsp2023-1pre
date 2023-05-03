package producteg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	Map<String, Product> products = new HashMap<>();
	//List<Product> products = new ArrayList<Product>();

	public ProductService() {
		Product p = new Product("101", "딥러닝", "신구문화사", 2000, "2022.4.2");
		products.put("101", p);
		p = new Product("102", "텐서플로", "ai출판사", 1999, "2022.4.2");
		products.put("102", p);
		p = new Product("103", "빅데이터", "사이언스", 2222, "2022.4.2");
		products.put("103", p);
	}

	public List<Product> finAll(){
		return new ArrayList<>(products.values());
	}
	
	public Product find(String id) {
		return products.get(id);
	}
}
