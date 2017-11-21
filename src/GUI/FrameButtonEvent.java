package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameButtonEvent extends JFrame implements ActionListener {
	JLabel idLabel;   //定义标签对象
	JTextField text;  //定义文本框对象
	JButton btnOk;    //定义按钮对象	
	
	public FrameButtonEvent(String title)
	{
		init();
		
		setTitle(title);   //设置标题
		setBounds(200,200,450,100);  //设置窗体显示位置和大小
		setResizable(false);  //设置窗体不可更改大小
		setVisible(true);  //设置窗体显示
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗体关闭模式
	}
	
	public void init()
	{
	    setLayout(new FlowLayout()); //设置布局方式为流式布局
		idLabel = new JLabel("电话号码："); //创建标签对象
		add(idLabel);  //将标签对象添加到窗体中
		text = new JTextField(20); //创建文本框对象
		add(text); //将文本框添加到窗体中
		btnOk = new JButton("获取号码"); // 创建按钮对象
		add(btnOk); //将按钮对象添加到窗体中

		btnOk.addActionListener(this); //将监听器对象注册给文本框对象		
	}
	
	//监听器接口中action事件处理方法，在此需要提供具体实现
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(text.getText());
	}

	public static void main(String args[]){
		FrameButtonEvent objFrameButtonEvent = new FrameButtonEvent("按钮事件");
	}
}