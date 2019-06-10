package The_forth.Exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.soap.Text;

public class deleteNoteDemo {								//练习题 8 		//待实现：保留注释非文字程序部分
	public static void main(String[] args) throws IOException {
		BufferedReader buffrf = new BufferedReader(new InputStreamReader(new FileInputStream("test.java")));
		BufferedWriter buffwf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test2.java")));
		StringBuffer content = new StringBuffer();
		String temp = null;
		while ((temp = buffrf.readLine()) != null) {
			content.append(temp);
			content.append("\n");
		}
		String target = content.toString();
		String s = target.replaceAll("\\/\\/[^\\n]*|\\/\\*([^\\*^\\/]*|[\\*^\\/*]*|[^\\**\\/]*)*\\*+\\/", "");
		buffwf.write(s);
		buffwf.flush();
		buffwf.close();
	}
}	

