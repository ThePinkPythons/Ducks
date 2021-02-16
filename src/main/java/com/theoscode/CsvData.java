/**
 * The Csv Data class.
 *
 * @author Theo White
 */

public class CsvData {

	String product_id;
	String quantity;
	String wholesale_cost;
	String sale_price;
	String supplier_id;

	public CsvData(String product_id, String quantity, String wholesale_cost, String sale_price, String supplier_id) {
		super();
		this.product_id = product_id;
		this.quantity = quantity;
		this.wholesale_cost = wholesale_cost;
		this.sale_price = sale_price;
		this.supplier_id = supplier_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getWholesale_cost() {
		return wholesale_cost;
	}

	public void setWholesale_cost(String wholesale_cost) {
		this.wholesale_cost = wholesale_cost;
	}

	public String getSale_price() {
		return sale_price;
	}

	public void setSale_price(String sale_price) {
		this.sale_price = sale_price;
	}

	public String getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}

}
