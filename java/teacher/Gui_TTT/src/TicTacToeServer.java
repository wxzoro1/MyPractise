import java.awt.BorderLayout;
import java.awt.Container;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



/**
 * <h1>�๦�ֲܷ�ʽ��������Ϸ - ��������</h1>
 */
public class TicTacToeServer extends JFrame implements TicTacToeConstant {

 /**
  * ȱʡ���а汾��ʶ
  */
 private static final long serialVersionUID = 1L;

 /**
  * ��ʾ������������Ϸ�������Ϣ�ı�
  */
 private JTextArea infoTextArea = new JTextArea();

 /**
  * ��ʾ������������Ϸ�������Ϣ���
  */
 private JScrollPane infoScrollPane = new JScrollPane(infoTextArea);

 /**
  * <b>���캯�� - �����������˳���</b>
  * 
  * @see TicTacToeServer
  * @param iniString
  *            �Զ��������������
  */
 public TicTacToeServer(String iniString) {
  // TODO Auto-generated constructor stub

  // ����Ϊ���ɱ༭
  infoTextArea.setEditable(false);

  // ���ı�����뵽��ܴ�����
  Container container = getContentPane();
  container.add(infoScrollPane, BorderLayout.CENTER);

  // ��ʾ����
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setTitle(iniString);
  setSize(500, 500);
  setVisible(true);

  // ��ʾ��ӭ��Ϣ
  showWelcome();

  try {
   // �����׽��ֲ����м���
   ServerSocket serverSocket = new ServerSocket(55555);
   infoTextArea.append("��ʼ��\n" + new Date() + " -> ������������\n\n");

   // ÿ�������һ��session����ʼ��������ţ�������
   int sessionNum = 0;

   // ����һ�������
   while (true) {

    // ���Ӳ����������
    infoTextArea.append("��������� - ���" + (++sessionNum) + "\n");

    // ���1���ͻ��ˣ��������������
    infoTextArea.append(new Date() + " -> �ȴ����1�������\n");
    Socket p1 = serverSocket.accept();
    infoTextArea.append(new Date() + " -> ���1�������\n");

    // ֪ͨ���1�����
    new DataOutputStream(p1.getOutputStream()).writeBoolean(P1);

    // ���2���ͻ��ˣ��������������
    infoTextArea.append(new Date() + " -> �ȴ����2�������\n");
    Socket p2 = serverSocket.accept();
    infoTextArea.append(new Date() + " -> ���2�������\n");

    // ��Ϸ��ʼ
    infoTextArea.append(new Date() + " -> ��Ϸ��ʼ" + "\n\n");

    // ֪ͨ���2�����
    new DataOutputStream(p2.getOutputStream()).writeBoolean(P2);

    // ����һ���߳�ʵ��������ҵ���������Ϸ
    TicTacToeBoard board = new TicTacToeBoard(p1, p2);
    board.start();
   }
  } catch (Exception e) {
   // TODO: handle exception
   e.printStackTrace();
  }
 }

 /**
  * <b>��ʾ��ӭ��Ϣ</b>
  * 
  * @see #TicTacToeServer(String)
  */
 private void showWelcome() {
  infoTextArea
    .append("*******************************************************************\n");
  infoTextArea.append("\n");
  infoTextArea
    .append("                   �� ӭ �� �� �� �� �� �� �� ʽ �� �� �� �� Ϸ ��\n");
  infoTextArea.append("\n");
  infoTextArea
    .append("                                     > ��л����Ŭ������������ѧϰʹ�ã� <\n");
  infoTextArea.append("\n");
  infoTextArea
    .append("*******************************************************************\n\n\n\n");
 }

 /**
  * <b>������ - ���з������˳���</b>
  * 
  * @see #TicTacToeServer(String)
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  new TicTacToeServer("�๦�ֲܷ�ʽ��������Ϸ TicTacToe - ��������");
 }
}
