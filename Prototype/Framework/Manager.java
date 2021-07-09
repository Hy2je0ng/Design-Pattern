package Framework;

import java.util.HashMap;

public class Manager {
	HashMap<String, Product> showcase = new HashMap<String, Product>();

	public void register(String s, Product proto) {
		showcase.put(s,proto);
	}
	
	public Product create(String s) {
		return showcase.get(s).createClone();
	}
}
