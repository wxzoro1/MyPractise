package The_forth.Prac_4;

import java.io.File;
import java.io.IOException;


public class Rename {
	public static void main(String[]args) {
		File oldFile = new File("old.txt");
		File newFile = new File("d:" + File.separator + "temp" + File.separator + "new.txt") ;
		if (oldFile.exists()) {
			oldFile.renameTo(newFile);
		}
		else {
			try {
				oldFile.createNewFile();
			} catch (IOException e) {
				System.out.println("�޷�����old.txt�ļ�");
			}
		}
	}
}
