package cell;

import java.awt.Graphics;											// cell��field 1.��ÿ��cell��һ��field�Ĺ����ߣ�cell֪��field��2.���ⲿ����������������֮��Ĺ�ϵ��cell��֪��field��
 																	
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
}																	//�ӿ�Interface�Ǵ������� ��Ա�������ǳ����� ��Ա��������public static final �ӿڹ涨���� ����������ʲô
																	//ʵ��implements ʵ���˳��������Ķ���
																	//����extends,�ӿ���implements�������ʵ�ֺܶ�ӿڣ� �ӿڿ��Լ̳нӿڣ����ܼ̳��ࣻ�ӿڲ���ʵ�ֽӿ�
																	//����ӿڵı�̷�ʽ ��Ƴ���ʱ�ȶ���ӿڣ� ��ʵ����
																	//�κ���Ҫ�ں����䴫�봫����һ���ǽӿڶ����Ǿ������
																	//�ʺ϶���ͬʱдһ������� ���������� �ȶ���һ�������ӿ� �ٶ�����
																	