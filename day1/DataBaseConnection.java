package week4.day1;

public interface DataBaseConnection {
	public abstract void connect();
	public abstract void disconnect();
	public abstract void executeUpdate();
}
