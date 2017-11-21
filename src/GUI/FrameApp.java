package GUI;

import javax.swing.JFrame;

/*
 * 使用面向对象思想创建窗体程序
 */
public class FrameApp extends JFrame  {
	public FrameApp(String title)
	{	
		setTitle(title);   //设置标题
		setBounds(100,100,800,600);  //设置窗体显示位置和大小
		setResizable(false);  //设置窗体不可更改大小
		setVisible(true);  //设置窗体显示
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗体关闭模式
	}
	
	public static void main(String args[]){
		FrameApp objFrameApp = new FrameApp("窗体程序");
	}
}