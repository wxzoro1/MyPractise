package The_third.Prac_3;


public interface WiFi {					//�ӿ�
	public void connect();
	public abstract void disconnect();	//abstract ����ʡ��
}

class Vechile{
	
}

class Bus extends Vechile implements WiFi{
	public void connect() {
		
	}
	public void disconnect() {
		
	}
}