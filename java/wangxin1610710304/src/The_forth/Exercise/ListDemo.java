package The_forth.Exercise;
import java.io.*;
import java.util.ArrayList;

public class ListDemo {							//练习题 3									
	public static void main(String[] args) {
		ArrayList<String> paths = new ArrayList<String>();
		paths = getFile(new File("C:\\Users\\lenovo\\eclipse-workspace\\wangxin1610710304"), paths);
		writeF(paths);
	}
	
	public static ArrayList<String> getFile(File path, ArrayList<String> paths) {
		File[] f = path.listFiles();
		if (f == null) {
			return paths;
		}
		for(File x:f) {
			if (x.isDirectory()) {
				paths.add(x.getPath());
				getFile(x, paths);
			}else {
				paths.add(x.getPath());
			}
		}
		return paths;
	}
	
	public static void writeF(ArrayList<String> paths) {
		File dir = new File("dir.txt");
		
		try {
			PrintStream out = new PrintStream(dir);
			for(String x: paths) {
				out.print(x);
				out.println();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("无法打开文件");
		}
	}
}
