package castle;

public class HandlerHelp extends Handler {
	public HandlerHelp(Game game) {				//当父类有有参的构造函数时，并且无无参的构造方法，子类必须在自己的构造函数显式调用父类的构造函数
		super(game);
	}
	@Override
	public void doCmd(String word) {
		System.out.print("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
	}

}
