package castle;

public class HandlerBye extends Handler{
	public HandlerBye(Game game) {				//���������вεĹ��캯��ʱ���������޲εĹ��췽��������������Լ��Ĺ��캯����ʽ���ø���Ĺ��캯��
		super(game);
	}
	@Override
	public boolean isBye() {
		return true;
	}
	
}
