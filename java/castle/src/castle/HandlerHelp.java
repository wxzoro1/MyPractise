package castle;

public class HandlerHelp extends Handler {
	public HandlerHelp(Game game) {				//���������вεĹ��캯��ʱ���������޲εĹ��췽��������������Լ��Ĺ��캯����ʽ���ø���Ĺ��캯��
		super(game);
	}
	@Override
	public void doCmd(String word) {
		System.out.print("��·������������������У�go bye help");
        System.out.println("�磺\tgo east");
	}

}
