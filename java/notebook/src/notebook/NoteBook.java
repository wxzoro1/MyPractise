package notebook;

import java.util.ArrayList;
import java.util.HashSet;


class Value{
	private int i;
	public void set(int i) {this.i = i;}
	public int get() {return i;}
	public String toString() {return ""+i;}					//�����ֱ����� �൱���Զ���iת�����ַ��� 
	
}
 
//-------------------------------------------------------------------------
public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>();//�����ࣨ���������ͣ�Ԫ�ص����ͣ� ������������ ������ Ҳ����for eachѭ��
//-------------------------------------------------------------------------
	public void add(String s){
		notes.add(s);
	}
	
	public void add(String s, int location){
		notes.add(location, s);// ֻ�ܷ�String	
	}
//-------------------------------------------------------------------------
	public int getSize() {
		return notes.size();//�Դ�����
	}
//-------------------------------------------------------------------------
	public String getNote(int index) {
		return notes.get(index);
	}
//-------------------------------------------------------------------------
	public void removeNote(int index) {
		notes.remove(index);
	}
//-------------------------------------------------------------------------
	public String[] list() {
		String[] a = new String[notes.size()];
		
		for (int i = 0; i<notes.size(); i++) {		//    �Դ�notes.toArray(a);
			a[i] = notes.get(i);
		}
		return a;
	}
//-------------------------------------------------------------------------
		public static void main(String[] args) {
//------------------------------------------------------------------------------------------
//			Value v = new Value();
//			v.set(1);
//			System.out.println(v+"       HERE");		//string tostring ֱ�����
//			
//-------------------------------------------------------------------------------------
//			ArrayList<String> a = new ArrayList<String>();
//			a.add("1");
//			a.add("2");
//			for (String s:a) {
//				System.out.println(s);
////				a.remove(1);							// for each �п����޸� ��ֻ�Ǹ��� Ӧ���ǹ����ߵ��¶�				
//			}
////			for (String s:a) {
////				System.out.println(s);					
////			}
//------------------------------------------------------------------------------------------
//			HashSet<String> b = new HashSet<String>();	//�������� Ԫ�ز��ظ� ������
//			b.add("1");
//			b.add("2");
//			b.add("1");
//			for (String s:b) {
//				System.out.println(s);			
//			}
//			System.out.println("--------------");
//			System.out.println(a);						//����ֱ�����
//			System.out.println(b);
//------------------------------------------------------------------------------------------
			Value[] a = new Value[10];
			for (int i=0; i<a.length; i++) {
				a[i]=new Value();						//ע��������� �����ʼ�� ��̫��Ϥ
				a[i].set(i);
			}
			for(Value v:a) {							//	for eachѭ�� �Զ���������˵ ���ܹ��޸�ֵ�� ��Ϊ�ǹ�����
				System.out.println(v.get());
				v.set(0);
			}
			for(Value v:a) {							//	for eachѭ�� �Զ���������˵ ���ܹ��޸�ֵ�� ��Ϊ�ǹ�����
			System.out.println(v.get());				// ȫ���޸ĳ�0
		}
			
//-----------------------------------------------------------------------------------------
//			NoteBook nb = new NoteBook();
//			nb.add("first");
//			nb.add("second");
//			nb.add("third", 0);
//			System.out.println(nb.getSize());
//			System.out.println(nb.getNote(0));
//			nb.removeNote(1);
//			String[] a = nb.list();
//			for (String s:a) {						//String s ��Ҫ��ĥ  ����a�����е�String s	String[]->null ��Ϊ�������ַ����Ĺ����� ����������ÿ��Ԫ�ض��Ƕ���Ĺ����߶��Ƕ�����
//				System.out.println(s);
//			}
////			System.out.println(nb.getNote(10));		//Խ��ᱨ��
//
}

}
