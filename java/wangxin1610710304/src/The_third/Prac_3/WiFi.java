package The_third.Prac_3;


public interface WiFi {					//接口
	public void connect();
	public abstract void disconnect();	//abstract 可以省略
}

class Vechile{
	
}

class Bus extends Vechile implements WiFi{
	public void connect() {
		
	}
	public void disconnect() {
		
	}
}