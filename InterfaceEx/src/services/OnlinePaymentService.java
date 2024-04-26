package services;

public interface OnlinePaymentService {

	public Double paymentFee(double amount);
	public Double interest(Double amount, Integer months);
	
}
