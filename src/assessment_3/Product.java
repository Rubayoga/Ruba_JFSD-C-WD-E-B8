package assessment_3;

public class Product implements Taxable {

	private Integer pid;
	private double price;
	private Integer quantity;

	public Product(Integer pid, double price, Integer quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public double calcTax() {
		return (salesTax * price / 100) * quantity;
	}

}
