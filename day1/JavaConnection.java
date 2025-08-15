package week4.day1;

public  class JavaConnection implements DataBaseConnection{
	public  void connect() {
		System.out.println("Connect");
		
	}
	public void disconnect() {
		System.out.println("Disconnect");
	}
	public void executeUpdate() {
		System.out.println("Execute Update");
	}
	public static void main(String[] args) {
		JavaConnection jz = new JavaConnection();
		jz.connect();
		jz.disconnect();
		jz.executeUpdate();
	}
	

}
