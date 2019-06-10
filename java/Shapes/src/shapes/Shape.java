package shapes;

import java.awt.Graphics;

public abstract class Shape {
	
	public abstract void draw(Graphics g);			//函数是抽象的 类必须抽象
													//抽象函数不能产生对象
													//抽象函数可以定义变量，继承了非抽象类的对象可以付给这个变量
													//继承自抽象类的子类必须覆盖父类中的抽象函数，不然自身成为抽象类
													//抽象的两种概念 1.与具体相对 表示概念非实体 2.与细节相对 一定程度上忽略细节而着眼大局
	
}
