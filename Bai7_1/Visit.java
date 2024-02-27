package Bai7_1;

import java.util.Date;

public class Visit {

    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
            }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense = ex;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }

    public double getDiscountService() {
        return serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMembershipType());
    }

    public double getDiscountProduct() {
        return productExpense * DiscountRate.getProductDiscountRate(customer.getMembershipType());
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense - getDiscountService() - getDiscountProduct();
    }

	@Override
	public String toString() {
		return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense
				+ ", productExpense=" + productExpense + "]";
	}

    
}