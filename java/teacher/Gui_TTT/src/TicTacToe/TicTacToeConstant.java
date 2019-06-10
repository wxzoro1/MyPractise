

/**
 * <h1>�����ӿ� - ����C/S����</h1>
 * 
 * @see TicTacToeServer
 * @see TicTacToeClient
 * @see TicTacToeBoard
  */
public interface TicTacToeConstant {

 /**
  * ���������ݣ����1
  */
 public static boolean P1 = true;

 /**
  * ���������ݣ����2
  */
 public static boolean P2 = false;

 /**
  * �����Ⱥ��֣����1����
  */
 public static boolean GO_FIRST_P1 = true;

 /**
  * �����Ⱥ��֣����2����
  */
 public static boolean GO_FIRST_P2 = false;

 /**
  * ���̿��ܵ�����״̬��ƽ��
  */
 public static int DRAW = 0;

 /**
  * ���̿��ܵ�����״̬�����1ʤ��
  */
 public static int WON_P1 = 1;

 /**
  * ���̿��ܵ�����״̬�����2ʤ��
  */
 public static int WON_P2 = 2;

 /**
  * ���̿��ܵ�����״̬����Ϸ����
  */
 public static int CONTINUE = 3;

 /**
  * ���ڴ����ܰ�ť����������
  */
 public static int OPTION_SELECTED = -1;

 /**
  * ���ڴ����ܰ�ť�����ؽ��
  */
 public static int RETURN_SELECTED = -2;

 /**
  * ���ܰ�ť�����ƣ��ؿ�����
  */
 public static int OPTION_NEWGAME = 1;

 /**
  * ���ܰ�ť�����ƣ�����
  */
 public static int OPTION_RETRACT = 2;

 /**
  * ���ܰ�ť�����ƣ�����
  */
 public static int OPTION_GIVEUP = 3;

 /**
  * ���ܰ�ť�����ƣ�����
  */
 public static int OPTION_ENDGAME = 4;

 /**
  * ���ܰ�ť�����ƣ�����
  */
 public static int OPTION_ABOUT = 5;

 /**
  * ��ʾ�Է���ҶԱ��������Ӧ��ͬ���ؿ�����
  */
 public static int RETURN_NEWGAME_YES = 11;

 /**
  * ��ʾ�Է���ҶԱ��������Ӧ�𣺲�ͬ���ؿ�����
  */
 public static int RETURN_NEWGAME_NO = 12;

 /**
  * ��ʾ�Է���ҶԱ��������Ӧ��ͬ�����
  */
 public static int RETURN_RETRACT_YES = 21;

 /**
  * ��ʾ�Է���ҶԱ��������Ӧ�𣺲�ͬ�����
  */
 public static int RETURN_RETRACT_NO = 22;

 /**
  * ��ʾ�Է���ҶԱ��������Ӧ��ͬ�����
  */
 public static int RETURN_ENDGAME_YES = 41;

 /**
  * ��ʾ�Է���ҶԱ��������Ӧ�𣺲�ͬ�����
  */
 public static int RETURN_ENDGAME_NO = 42;
}
