package model.entities;

public class Invoice {

	private Double basicPayment;
	private Double tax;
	
	//constructors
	public Invoice() {	
	}

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	
	//method
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}

	//getters setters
	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
}
