package The_forth.Prac_4;
import java.io.*;

public class Hello {
	public static void main(String[]args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			int n =Integer.parseInt(str);
			System.out.println("�ղ�����������ǣ�" + n);
		} catch (IOException e) {
			System.out.println("readLine()ʧ��");
			}
	}
}
