package castle;

public class HandlerBye extends Handler{
	public HandlerBye(Game game) {				//当父类有有参的构造函数时，并且无无参的构造方法，子类必须在自己的构造函数显式调用父类的构造函数
		super(game);
	}
	@Override
	public boolean isBye() {
		return true;
	}
	
}
