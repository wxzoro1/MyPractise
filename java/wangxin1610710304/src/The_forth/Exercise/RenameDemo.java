package The_forth.Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.FieldPosition;
import java.util.ArrayList;
										
public class RenameDemo {					//��ϰ�� 4	
	private String fnames;
	private String trail;
	private String newname;
	
	public RenameDemo(String fnames, String trail, String newname) {
		this.fnames = fnames;
		this.trail = trail;
		this.newname = newname;
	}
	
	public static void main(String[] args) {
		String fnames = new String("test.txt");
		String trail = new String("C:\\Users\\lenovo\\eclipse-workspace\\wangxin1610710304");
		String newname = new String("success3.txt");
		RenameDemo app = new RenameDemo(fnames, trail, newname);
//		���������ļ�
		File test = new File("test.txt");
		try {
			PrintStream out = new PrintStream(test);
			out.print("test");
		} catch (FileNotFoundException e) {
			System.out.println("�޷����ļ�");
		}
//		��������ļ��Ƿ����
//		app.lookupFile(newname, trail, newname);
//		����
//		app.lookupFile(fnames, trail, newname);	
	}
	
	public void lookupFile(String fnames, String trail, String newname) {
		File path =new File(trail);
		File[] f = path.listFiles();
		if (f == null) {
			System.out.println("������");
		}else {
			for(File x:f) {
				if (x.isDirectory()) {
//					System.out.println("����һ��Ŀ¼"+x.getAbsolutePath());					
					lookupFile(fnames, x.getAbsolutePath(), newname);
				}else if (x.getName().equals(fnames)) {
					if (x.getName().equals(newname)) {
						System.out.println(newname+"�������Ѿ�����,�޷���������");
						break;
					}else {
						x.renameTo(new File(x.getParent()+x.separator+newname));
						System.out.println(fnames+"��������Ϊ"+newname);
						break;
					}
				}else {
//					System.out.println("û���ҵ�"+fnames);	
				}
			}
		}
	}
}
