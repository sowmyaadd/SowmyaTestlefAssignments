package week4.day1;

public class Amazon extends CanaraBank{
	public void recordPaymentDetails() {
		System.out.println("Record Payment Details");
	}
	public static void main(String[] args) {
		Amazon az = new Amazon();
		az.recordPaymentDetails();
		az.cashOnDelivery();
		az.upiPayments();
		az.cardPayments();
		az.internetBanking();
	}

}
