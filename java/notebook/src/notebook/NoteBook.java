package notebook;

import java.util.ArrayList;
import java.util.HashSet;


class Value{
	private int i;
	public void set(int i) {this.i = i;}
	public int get() {return i;}
	public String toString() {return ""+i;}					//神奇的直接输出 相当于自动把i转换成字符串 
	
}
 
//-------------------------------------------------------------------------
public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>();//容器类（容器的类型，元素的类型） 储存多任意对象 范型类 也可以for each循环
//-------------------------------------------------------------------------
	public void add(String s){
		notes.add(s);
	}
	
	public void add(String s, int location){
		notes.add(location, s);// 只能放String	
	}
//-------------------------------------------------------------------------
	public int getSize() {
		return notes.size();//自带函数
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
		
		for (int i = 0; i<notes.size(); i++) {		//    自带notes.toArray(a);
			a[i] = notes.get(i);
		}
		return a;
	}
//-------------------------------------------------------------------------
		public static void main(String[] args) {
//------------------------------------------------------------------------------------------
//			Value v = new Value();
//			v.set(1);
//			System.out.println(v+"       HERE");		//string tostring 直接输出
//			
//-------------------------------------------------------------------------------------
//			ArrayList<String> a = new ArrayList<String>();
//			a.add("1");
//			a.add("2");
//			for (String s:a) {
//				System.out.println(s);
////				a.remove(1);							// for each 中可以修改 不只是复制 应该是管理者的事儿				
//			}
////			for (String s:a) {
////				System.out.println(s);					
////			}
//------------------------------------------------------------------------------------------
//			HashSet<String> b = new HashSet<String>();	//集合容器 元素不重复 无序性
//			b.add("1");
//			b.add("2");
//			b.add("1");
//			for (String s:b) {
//				System.out.println(s);			
//			}
//			System.out.println("--------------");
//			System.out.println(a);						//满足直接输出
//			System.out.println(b);
//------------------------------------------------------------------------------------------
			Value[] a = new Value[10];
			for (int i=0; i<a.length; i++) {
				a[i]=new Value();						//注意对象数组 对象初始化 不太熟悉
				a[i].set(i);
			}
			for(Value v:a) {							//	for each循环 对对象数组来说 是能够修改值的 因为是管理者
				System.out.println(v.get());
				v.set(0);
			}
			for(Value v:a) {							//	for each循环 对对象数组来说 是能够修改值的 因为是管理者
			System.out.println(v.get());				// 全部修改成0
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
//			for (String s:a) {						//String s 需要琢磨  遍历a数组中的String s	String[]->null 因为里面是字符串的管理者 （对象数组每个元素都是对象的管理者而非对象本身）
//				System.out.println(s);
//			}
////			System.out.println(nb.getNote(10));		//越界会报错
//
}

}
