package animal;

import java.awt.Color;
import java.awt.Graphics;

import Field.Location;
import cell.Cell;

public class Rabbit extends Animal implements Cell {

	public Rabbit() {

//   	最大年龄，成熟年龄，繁殖率，移动率（当前追踪模式无效）
		super(28, 6, 0.075, 0.4);
//		super(99999999, 6, 0, 3);
	}

	@Override
	public void draw(Graphics g, int x, int y, int size) {
		int alpha = 255 - (int)(255.0 * age / die_age);
		g.setColor(new Color(33, 33, 33, alpha));
		g.fillRect(x, y, size, size);
	}

	@Override
	public Location eat(Location[] rabbit_locs) {
		return null;	// 兔子不吃
	}
	
	@Override
	public Animal baby() {
		return new Rabbit();
	}
}
