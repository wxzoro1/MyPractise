package frame;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.net.*;
import java.applet.AudioClip;

//import lable.MineLabel;
//import javax.swing.JPanel;

//import panel.FacePanel;
//import panel.MinePanel;

import listener.MouseListener;
import menu.MineMenu;

import panel.MineField;
import panel.MineState;
import timer.Timers;
import bean.MineLabel;

import tools.Tools;

public class SartFrame extends JFrame {

 /**
  * 
  */
 private static final long serialVersionUID = -1585043387266273492L;
 /**
  * @param args
  */

 private MineState mineState; // 记雷数
 private MineField mineField; // 布置labble和雷数
 private MineMenu mineMenu;
 private Timer timer;
 private Timers timers;
 /**
  * 游戏是否开始
  */
 private boolean isStart;
 JLabel jLabel_start = new JLabel(); // 开始图片


 public SartFrame() {
  this.setTitle("扫雷");
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLocationRelativeTo(null);
  setIconImage(Tools.iicon); // 利用tools来做的作法

  this.setResizable(false); // 这样让窗口不会可放大
  
  
  // ..................状态栏.....................
  mineState = new MineState(this);
  this.add(mineState, BorderLayout.NORTH);

  // ...................雷区......................
  mineField = new MineField(this);
  this.add(mineField, BorderLayout.CENTER);

  jLabel_start.setIcon(Tools.start);
  this.add(jLabel_start, BorderLayout.CENTER);

  // ....................菜单栏................
  mineMenu = new MineMenu(this);
  this.setJMenuBar(mineMenu);
  
  // .....................时间................
  Tools.time = 0;
  timers = new Timers(mineState);
  timer = new Timer(1000, timers);

  // ...................声音...................
//  AudioClip s1=loadSound("alarm1.wav");                           //AudioClip类的对象s1通过方法 loadSound()装载声音
//  public AudioClip loadSound(String filename){                        //返回一个AudioClip对象
//     URL url=null;                                                                   //因为newAudioClip()的参数为URL型
//     try{
//      url=new URL("file:"+filename);                                //指定文件，“file:"不能少
//     }
//     catch(MalformedURLException e){ }
//     return Applet.newAudioClip(url);                           //通过newAudioClip( )方法装载声音，此方法为JDK后添加的方法，太老的JDK里可能没有
//  }
//
//  
//  
//  
  pack();
  this.setVisible(true);
 }


 // 重新布局
 public void restart() {

  this.remove(mineState);

  this.remove(mineField);

  this.remove(jLabel_start);
  
  

  // ..................状态栏.....................
  mineState = new MineState(this);
  this.add(mineState, BorderLayout.NORTH);
  

  
  // ...................雷区......................
  mineField = new MineField(this);
  this.add(mineField, BorderLayout.CENTER);

  
  // .....................时间................
  Tools.time = 0;
  Timers timers = new Timers(mineState);
  timer = new Timer(1000, timers);
  
  
  pack();
  validate();//刷新窗体
 }



 public static long getSerialversionuid() {
  return serialVersionUID;
 }



 public MineState getMineState() {
  return mineState;
 }



 public MineField getMineField() {
  return mineField;
 }



 public MineMenu getMineMenu() {
  return mineMenu;
 }



 public Timer getTimer() {
  return timer;
 }



 public Timers getTimers() {
  return timers;
 }

 
 
 

 public boolean isStart() {
  return isStart;
 }

 public void setStart(boolean isStart) {
  this.isStart = isStart;
 }
 public static void main(String[] args) {
  new SartFrame();
  
 }
 
 
 
 

 
 
}
