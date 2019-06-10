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
 * <h1>多功能分布式三子棋游戏 - 服务器端</h1>
 */
public class TicTacToeServer extends JFrame implements TicTacToeConstant {

 /**
  * 缺省串行版本标识
  */
 private static final long serialVersionUID = 1L;

 /**
  * 显示服务器运行游戏的相关信息文本
  */
 private JTextArea infoTextArea = new JTextArea();

 /**
  * 显示服务器运行游戏的相关信息面板
  */
 private JScrollPane infoScrollPane = new JScrollPane(infoTextArea);

 /**
  * <b>构造函数 - 创建服务器端程序</b>
  * 
  * @see TicTacToeServer
  * @param iniString
  *            自定义服务器端名称
  */
 public TicTacToeServer(String iniString) {
  // TODO Auto-generated constructor stub

  // 设置为不可编辑
  infoTextArea.setEditable(false);

  // 把文本域加入到框架窗口中
  Container container = getContentPane();
  container.add(infoScrollPane, BorderLayout.CENTER);

  // 显示窗口
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setTitle(iniString);
  setSize(500, 500);
  setVisible(true);

  // 显示欢迎信息
  showWelcome();

  try {
   // 创建套接字并进行监听
   ServerSocket serverSocket = new ServerSocket(55555);
   infoTextArea.append("初始化\n" + new Date() + " -> 启动服务器端\n\n");

   // 每个棋局是一个session，初始化棋盘序号（数量）
   int sessionNum = 0;

   // 创建一个新棋局
   while (true) {

    // 增加并开启新棋局
    infoTextArea.append("开启新棋局 - 棋局" + (++sessionNum) + "\n");

    // 玩家1（客户端）与服务器端连接
    infoTextArea.append(new Date() + " -> 等待玩家1加入棋局\n");
    Socket p1 = serverSocket.accept();
    infoTextArea.append(new Date() + " -> 玩家1加入棋局\n");

    // 通知玩家1的身份
    new DataOutputStream(p1.getOutputStream()).writeBoolean(P1);

    // 玩家2（客户端）与服务器端连接
    infoTextArea.append(new Date() + " -> 等待玩家2加入棋局\n");
    Socket p2 = serverSocket.accept();
    infoTextArea.append(new Date() + " -> 玩家2加入棋局\n");

    // 游戏开始
    infoTextArea.append(new Date() + " -> 游戏开始" + "\n\n");

    // 通知玩家2的身份
    new DataOutputStream(p2.getOutputStream()).writeBoolean(P2);

    // 启动一个线程实现两个玩家的三子棋游戏
    TicTacToeBoard board = new TicTacToeBoard(p1, p2);
    board.start();
   }
  } catch (Exception e) {
   // TODO: handle exception
   e.printStackTrace();
  }
 }

 /**
  * <b>显示欢迎信息</b>
  * 
  * @see #TicTacToeServer(String)
  */
 private void showWelcome() {
  infoTextArea
    .append("*******************************************************************\n");
  infoTextArea.append("\n");
  infoTextArea
    .append("                   欢 迎 来 到 多 功 能 分 布 式 三 子 棋 游 戏 厅\n");
  infoTextArea.append("\n");
  infoTextArea
    .append("                                     > 感谢各方努力！仅仅限于学习使用！ <\n");
  infoTextArea.append("\n");
  infoTextArea
    .append("*******************************************************************\n\n\n\n");
 }

 /**
  * <b>主函数 - 运行服务器端程序</b>
  * 
  * @see #TicTacToeServer(String)
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  new TicTacToeServer("多功能分布式三子棋游戏 TicTacToe - 服务器端");
 }
}
