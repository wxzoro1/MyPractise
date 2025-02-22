
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * <h1>棋盘类 - 游戏线程</h1>
 * 
 * @see TicTacToeServer
 */
public class TicTacToeBoard extends Thread implements TicTacToeConstant {
 // TODO Auto-generated constructor stub

 /**
  * 玩家1使用的套接字
  */
 private Socket p1;

 /**
  * 玩家2使用的套接字
  */
 private Socket p2;

 /**
  * 标识棋盘上所有格子的状态
  */
 private char[][] cell = new char[3][3];

 /**
  * 玩家1自服务器端的输入流
  */
 private DataInputStream p1Input;

 /**
  * 玩家1到服务器端的输出流
  */
 private DataOutputStream p1Output;

 /**
  * 玩家2自服务器端的输入流
  */
 private DataInputStream p2Input;

 /**
  * 玩家2到服务器端的输出流
  */
 private DataOutputStream p2Output;

 /**
  * 标识先后手（由玩家1决定谁是先手）
  */
 private boolean goFirstFlag;

 /**
  * 当棋盘格子状态改变时，变量表行号；当功能按键被触发时，变量表状态序号
  */
 private int rowOrState;

 /**
  * 当棋盘格子状态改变时，变量表列号；当功能按键被触发时，变量表选项序号
  */
 private int columnOrOption;

 /**
  * <b>构造函数 - 创建一个棋盘线程</b>
  * 
  * @see TicTacToeBoard
  * @param p1
  *            玩家1Socket
  * @param p2
  *            玩家2Socket
  */
 public TicTacToeBoard(Socket p1, Socket p2) {
  // TODO Auto-generated constructor stub

  // 初始化套接字
  this.p1 = p1;
  this.p2 = p2;

  // 初始化棋盘状态
  for (int i = 0; i < 3; ++i) {
   for (int j = 0; j < 3; ++j) {
    cell[i][j] = ' ';
   }
  }
 }

 /**
  * <b>重载线程类的run()函数</b>
  * 
  * @see #receiveMoveOrOption(DataInputStream)
  * @see #sendMove(DataOutputStream, int, int)
  * @see #sendOption(DataOutputStream, int, int)
  * @see #resetBoard()
  * @see #receiveBoard(DataInputStream)
  * @see #isWon(char)
  * @see #isFull()
  */
 public void run() {
  // TODO Auto-generated method stub

  try {
   // 创建玩家1和玩家2的输入输出流
   p1Input = new DataInputStream(p1.getInputStream());
   p1Output = new DataOutputStream(p1.getOutputStream());
   p2Input = new DataInputStream(p2.getInputStream());
   p2Output = new DataOutputStream(p2.getOutputStream());

   // 通知玩家1选择先后手并开始游戏
   p1Output.writeBoolean(true);

   // 接收玩家1的选择
   goFirstFlag = p1Input.readBoolean();

   // 通知两个玩家先后手的的选择结果
   p1Output.writeBoolean(goFirstFlag);
   p2Output.writeBoolean(goFirstFlag);

   // 游戏开始
   while (true) {
    // 玩家1先手
    if (goFirstFlag == GO_FIRST_P1) {
     // 得到玩家1走棋或控制信息
     receiveMoveOrOption(p1Input);

     // 如果是控制信息
     if (rowOrState == OPTION_SELECTED) {
      sendOption(p2Output, rowOrState, columnOrOption);
     } else if (rowOrState == RETURN_SELECTED) {
      if (columnOrOption == RETURN_RETRACT_YES) {
       receiveBoard(p1Input);
      } else if (columnOrOption == RETURN_NEWGAME_YES) {
       resetBoard();
      }

      sendOption(p2Output, rowOrState, columnOrOption);

      // 如果是走棋信息
     } else {
      cell[rowOrState][columnOrOption] = 'X';

      // 检查玩家1是否胜利
      if (isWon('X')) {
       // 通知两个玩家 玩家1胜利
       p1Output.writeInt(WON_P1);
       p2Output.writeInt(WON_P1);

       // 向玩家2发送玩家1的走棋信息
       sendMove(p2Output, rowOrState, columnOrOption);

       // 结束当前棋局
       break;

       // 检查是否平局
      } else if (isFull()) {
       p1Output.writeInt(DRAW);
       p2Output.writeInt(DRAW);
       sendMove(p2Output, rowOrState, columnOrOption);
       break;

       // 游戏继续
      } else {
       p2Output.writeInt(CONTINUE);
       sendMove(p2Output, rowOrState, columnOrOption);
      }
     }

     // 得到玩家2的走棋或控制信息
     receiveMoveOrOption(p2Input);

     // 如果是控制信息
     if (rowOrState == OPTION_SELECTED) {
      sendOption(p1Output, rowOrState, columnOrOption);
     } else if (rowOrState == RETURN_SELECTED) {
      if (columnOrOption == RETURN_RETRACT_YES) {
       receiveBoard(p2Input);
      } else if (columnOrOption == RETURN_NEWGAME_YES) {
       resetBoard();
      }

      sendOption(p1Output, rowOrState, columnOrOption);

      // 如果是走棋信息
     } else {
      cell[rowOrState][columnOrOption] = 'O';

      // 检查玩家2是否胜利
      if (isWon('O')) {
       // 通知两个玩家 玩家2胜利
       p1Output.writeInt(WON_P2);
       p2Output.writeInt(WON_P2);

       // 向玩家1发送玩家2的走棋信息
       sendMove(p1Output, rowOrState, columnOrOption);

       // 结束当前棋局
       break;

       // 检查是否平局
      } else if (isFull()) {
       p1Output.writeInt(DRAW);
       p2Output.writeInt(DRAW);
       sendMove(p1Output, rowOrState, columnOrOption);
       break;

       // 游戏继续
      } else {
       p1Output.writeInt(CONTINUE);
       sendMove(p1Output, rowOrState, columnOrOption);
      }
     }

     // 玩家2先手
    } else {
     // 得到玩家2的走棋或控制信息
     receiveMoveOrOption(p2Input);

     // 如果是控制信息
     if (rowOrState == OPTION_SELECTED) {
      sendOption(p1Output, rowOrState, columnOrOption);
     } else if (rowOrState == RETURN_SELECTED) {
      if (columnOrOption == RETURN_RETRACT_YES) {
       receiveBoard(p2Input);
      } else if (columnOrOption == RETURN_NEWGAME_YES) {
       resetBoard();
      }

      sendOption(p1Output, rowOrState, columnOrOption);

      // 如果是走棋信息
     } else {
      cell[rowOrState][columnOrOption] = 'O';

      // 检查玩家2是否胜利
      if (isWon('O')) {
       // 通知两个玩家 玩家2胜利
       p1Output.writeInt(WON_P2);
       p2Output.writeInt(WON_P2);

       // 向玩家1发送玩家2的走棋信息
       sendMove(p1Output, rowOrState, columnOrOption);

       // 结束当前棋局
       break;

       // 检查是否平局
      } else if (isFull()) {
       p1Output.writeInt(DRAW);
       p2Output.writeInt(DRAW);
       sendMove(p1Output, rowOrState, columnOrOption);
       break;

       // 游戏继续
      } else {
       p1Output.writeInt(CONTINUE);
       sendMove(p1Output, rowOrState, columnOrOption);
      }
     }

     // 得到玩家1走棋或控制信息
     receiveMoveOrOption(p1Input);

     // 如果是控制信息
     if (rowOrState == OPTION_SELECTED) {
      sendOption(p2Output, rowOrState, columnOrOption);
     } else if (rowOrState == RETURN_SELECTED) {
      if (columnOrOption == RETURN_RETRACT_YES) {
       receiveBoard(p1Input);
      } else if (columnOrOption == RETURN_NEWGAME_YES) {
       resetBoard();
      }

      sendOption(p2Output, rowOrState, columnOrOption);

      // 如果是走棋信息
     } else {
      cell[rowOrState][columnOrOption] = 'X';

      // 检查玩家1是否胜利
      if (isWon('X')) {
       // 通知两个玩家 玩家1胜利
       p1Output.writeInt(WON_P1);
       p2Output.writeInt(WON_P1);

       // 向玩家2发送玩家1的走棋信息
       sendMove(p2Output, rowOrState, columnOrOption);

       // 结束当前棋局
       break;

       // 检查是否平局
      } else if (isFull()) {
       p1Output.writeInt(DRAW);
       p2Output.writeInt(DRAW);
       sendMove(p2Output, rowOrState, columnOrOption);
       break;

       // 游戏继续
      } else {
       p2Output.writeInt(CONTINUE);
       sendMove(p2Output, rowOrState, columnOrOption);
      }
     }
    }
   }
  } catch (Exception e) {
   // TODO: handle exception
   e.printStackTrace();
  }
 }

 /**
  * <b>接收玩家的走棋或控制信息</b>
  * 
  * @see #run()
  * @param in
  *            输入流
  * @throws IOException
  */
 private void receiveMoveOrOption(DataInputStream in) throws IOException {
  rowOrState = in.readInt();
  columnOrOption = in.readInt();
 }

 /**
  * <b>发送走棋信息给另一玩家</b>
  * 
  * @see #run()
  * @param out
  *            输出流
  * @param row
  *            行号
  * @param column
  *            列号
  * @throws IOException
  */
 private void sendMove(DataOutputStream out, int row, int column)
   throws IOException {
  out.writeInt(row);
  out.writeInt(column);
 }

 /**
  * <b>发送控制信息给另一玩家</b>
  * 
  * @see #run()
  * @param out
  *            输出流
  * @param state
  *            状态信息
  * @param option
  *            选项信息
  * @throws IOException
  */
 private void sendOption(DataOutputStream out, int state, int option)
   throws IOException {
  out.writeInt(state);
  out.writeInt(option);
 }

 /**
  * <b>从同意悔棋一方得到整个棋盘的状态</b>
  * 
  * @see #run()
  * @param in
  *            输入流
  * @throws IOException
  */
 private void receiveBoard(DataInputStream in) throws IOException {
  int i, j;
  for (i = 0; i < 3; ++i) {
   for (j = 0; j < 3; ++j) {
    cell[i][j] = in.readChar();
   }
  }
 }

 /**
  * <b>清空棋盘</b>
  * 
  * @see #run()
  */
 private void resetBoard() {
  int i, j;
  for (i = 0; i < 3; ++i) {
   for (j = 0; j < 3; ++j) {
    cell[i][j] = ' ';
   }
  }
 }

 /**
  * <b>判断棋盘是否填满</b>
  * 
  * @see #run()
  * @return 棋盘是否填满
  */
 private boolean isFull() {
  for (int i = 0; i < 3; ++i) {
   for (int j = 0; j < 3; ++j) {
    if (cell[i][j] == ' ') {
     return false;
    }
   }
  }
  return true;
 }

 /**
  * <b>判断玩家是否胜利</b>
  * 
  * @see #run()
  * @param token
  *            X为玩家1，O为玩家2
  * @return 玩家是否胜利
  */
 private boolean isWon(char token) {
  // 检查所有行
  for (int i = 0; i < 3; ++i) {
   if ((cell[i][0] == token) && (cell[i][1] == token)
     && (cell[i][2] == token)) {
    return true;
   }
  }

  // 检查所有列
  for (int j = 0; j < 3; ++j) {
   if ((cell[0][j] == token) && (cell[1][j] == token)
     && (cell[2][j] == token)) {
    return true;
   }
  }

  // 检查主对角线
  if ((cell[0][0] == token) && (cell[1][1] == token)
    && (cell[2][2] == token)) {
   return true;
  }

  // 检查从对角线
  if ((cell[0][2] == token) && (cell[1][1] == token)
    && (cell[2][0] == token)) {
   return true;
  }

  return false;
 }
}
