

/**
 * <h1>常量接口 - 用于C/S交互</h1>
 * 
 * @see TicTacToeServer
 * @see TicTacToeClient
 * @see TicTacToeBoard
  */
public interface TicTacToeConstant {

 /**
  * 表明玩家身份：玩家1
  */
 public static boolean P1 = true;

 /**
  * 表明玩家身份：玩家2
  */
 public static boolean P2 = false;

 /**
  * 表明先后手：玩家1先手
  */
 public static boolean GO_FIRST_P1 = true;

 /**
  * 表明先后手：玩家2先手
  */
 public static boolean GO_FIRST_P2 = false;

 /**
  * 棋盘可能的四种状态：平局
  */
 public static int DRAW = 0;

 /**
  * 棋盘可能的四种状态：玩家1胜利
  */
 public static int WON_P1 = 1;

 /**
  * 棋盘可能的四种状态：玩家2胜利
  */
 public static int WON_P2 = 2;

 /**
  * 棋盘可能的四种状态：游戏继续
  */
 public static int CONTINUE = 3;

 /**
  * 用于处理功能按钮：发出请求
  */
 public static int OPTION_SELECTED = -1;

 /**
  * 用于处理功能按钮：返回结果
  */
 public static int RETURN_SELECTED = -2;

 /**
  * 功能按钮的名称：重开本局
  */
 public static int OPTION_NEWGAME = 1;

 /**
  * 功能按钮的名称：悔棋
  */
 public static int OPTION_RETRACT = 2;

 /**
  * 功能按钮的名称：认输
  */
 public static int OPTION_GIVEUP = 3;

 /**
  * 功能按钮的名称：结束
  */
 public static int OPTION_ENDGAME = 4;

 /**
  * 功能按钮的名称：关于
  */
 public static int OPTION_ABOUT = 5;

 /**
  * 表示对方玩家对本方请求的应答：同意重开本局
  */
 public static int RETURN_NEWGAME_YES = 11;

 /**
  * 表示对方玩家对本方请求的应答：不同意重开本局
  */
 public static int RETURN_NEWGAME_NO = 12;

 /**
  * 表示对方玩家对本方请求的应答：同意悔棋
  */
 public static int RETURN_RETRACT_YES = 21;

 /**
  * 表示对方玩家对本方请求的应答：不同意悔棋
  */
 public static int RETURN_RETRACT_NO = 22;

 /**
  * 表示对方玩家对本方请求的应答：同意结束
  */
 public static int RETURN_ENDGAME_YES = 41;

 /**
  * 表示对方玩家对本方请求的应答：不同意结束
  */
 public static int RETURN_ENDGAME_NO = 42;
}
