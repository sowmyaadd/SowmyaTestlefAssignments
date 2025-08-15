package week4.day1;

public abstract class CanaraBank implements Payments {
	public void cashOnDelivery(){
			System.out.println("Cash On Delivery");		
	}
	public void upiPayments() {
		System.out.println("upi");
	}
	public void cardPayments() {
		System.out.println("card");
	}
	public void internetBanking() {
		System.out.println("Internet");
	}
public abstract void recordPaymentDetails();
}