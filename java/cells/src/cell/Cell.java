package cell;

import java.awt.Graphics;											// cell和field 1.让每个cell有一个field的管理者（cell知道field）2.由外部第三方来建立两者之间的关系（cell不知道field）
 																	
public class Cell {
	private boolean alive = false;
	
	public void die() { alive = false; }
	public void reborn() { alive = true; }
	public boolean isAlive() { return alive; }
	
	public void draw(Graphics g, int x, int y, int size) {
		g.drawRect(x, y, size, size);
		if ( alive ) {
			g.fillRect(x, y, size, size);
		}
	}
}																	//接口Interface是纯抽象类 成员函数都是抽象函数 成员变量都是public static final 接口规定长相 不管里面有什么
																	//实现implements 实现了抽象类的类的对象
																	//类用extends,接口用implements；类可以实现很多接口； 接口可以继承接口，不能继承类；接口不能实现接口
																	//面向接口的编程方式 设计程序时先定义接口， 再实现类
																	//任何需要在函数间传入传出的一定是接口而不是具体的类
																	//适合多人同时写一个大程序 代码量增加 先定义一个或多个接口 再定义类
																	