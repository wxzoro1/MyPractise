package The_forth.Exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

public class CopyDemo {
	public static void main(String[]args) {									//练习题 6
		CopyDemo f = new CopyDemo();
		ArrayList<File> old = new ArrayList<File>();						//源文件集合
			old.add(new File("file1.txt"));				
			old.add(new File("file2.txt"));
			old.add(new File("file3.txt"));
//			old.add(new File("old.txt"));
		try {
			f.copy(old, new File("new.txt"));								//合并后新文件
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void copy(ArrayList<File> old, File newFile) throws IOException{
		FileInputStream fileInput = null;
		FileChannel inChannel = null;
		FileOutputStream fileOutput = new FileOutputStream(newFile, true);
		FileChannel outChannel = fileOutput.getChannel();
		
		long start = 0;
		for (int i = 0; i < old.size(); i++) {
			fileInput = new FileInputStream(old.get(i));
			inChannel = fileInput.getChannel();
			outChannel.transferFrom(inChannel, start, old.get(i).length());
			start += old.get(i).length();
			fileInput.close();
			inChannel.close();
		}
		fileOutput.close();
		outChannel.close();
	}
}

