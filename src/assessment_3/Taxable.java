package assessment_3;

public interface Taxable {
	double salesTax = 7;
	double incomeTax = 10.5;

	abstract double calcTax();
}
