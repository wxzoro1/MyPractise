package cd;
import java.util.ArrayList;

public class database {
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	
	private ArrayList<Item> listItem = new ArrayList<Item>();

	
//	public void add(CD cd) {								//CD��String cd��s
//		listCD.add(cd);
//	}
//	
//	public void add(DVD dvd) {								
//		listDVD.add(dvd);
//	}
	
	public void add(Item item) {							
		listItem.add(item);
	}
	
	public void list() {
//		for (CD cd : listCD) {
//			cd.print();
//		}
//		for (DVD dvd: listDVD) {
//			dvd.print();
//		}
		for (Item item: listItem) { 			//�������õİ� ��̬�� ��̬�� �ڳ�Ա���������������Ա����Ҳ��ͨ��this���������������õģ���ĥ��ĥҲ��һ�ֶ�̬�󶨣�
			item.print();						//����override ���ุ����ȫһ�� ������ô��ڸ��ǹ�ϵ�ĺ���ʱ������ñ�����ʱ������Ķ�����������ĺ��� ��ͽ�����̬
		}
	}
	public static void main(String[] args) {
		int i = (int)0.1;//����ת����ͬ������ת�� ǰ�߷����ı� ���߲���
		Item item = new Item("sd", 1, false, "23");
//		CD cd = item; //���಻�ܸ��������
//		item = cd;//������Ը��������
//		CD cc =(CD)item; //��ʱitem����CD���� �˰취����ͨ�������ҿ���  ����ʹͨ�� Ҳ�ᷢ��ClassCastException
		database db = new database();
		db.add(new CD("��Ȼ������","jayzhou", 11, 129, "real good"));
		db.add(new CD("Ħ����","jayzhou", 9, 119, "real real good"));
		db.add(new DVD("ͷ����D","jayzhou", 123, "cool"));
		db.add(new Game("q", 5, false,"a", 2));
		db.list();
		
	}

}
