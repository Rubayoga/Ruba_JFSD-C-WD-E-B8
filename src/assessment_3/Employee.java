package assessment_3;

public class Employee implements Taxable {
	 private Integer id;
	 private String name;
	 private double salary;

	public Employee(Integer id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public double calcTax() {
		return incomeTax * salary / 100;
		
	}
}
