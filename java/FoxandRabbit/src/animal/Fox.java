package animal;

import java.awt.Color;
import java.awt.Graphics;

import Field.Location;
import cell.Cell;

public class Fox extends Animal implements Cell {

	public Fox() {
		//   最大年龄，成熟年龄，繁殖率，移动率（当前追踪模式无效）
		super(32, 12, 0.0285, 0.4);
	}

	@Override // Cell接口实现
	public void draw(Graphics g, int x, int y, int size) {
		int alpha = 255 - (int)(255.0 * age / die_age);
		g.setColor(new Color(255, 102, 114, alpha));
		g.fillRect(x, y, size, size);
	}

	@Override // 父类抽象函数eat实现
	public Location eat(Location[] rabbit_locs) {
		Location ret = null;
		if ( 0 != rabbit_locs.length && Math.random() < 0.3 ) {
			int index = (int)(Math.random() * rabbit_locs.length);
			ret = rabbit_locs[index];
			this.longerLife(1);
		}
		return ret;
	}

	@Override // 父类抽象函数baby实现
	public Animal baby() {
		return new Fox();
	}
}
