package GUI;

import javax.swing.*;
 
public class LayoutNull extends JFrame{
	JButton btn1,btn2;
	 
	LayoutNull() {
		this.setTitle("自由布局");
		this.setBounds(100,100,250,150);

		//设置窗体为空布局
		this.setLayout(null);
		btn1=new JButton("按钮A");
		btn2=new JButton("按钮B");

		this.add(btn1);
		//设置按钮btn1的精确位置
		btn1.setBounds(30,30,80,25);

		this.add(btn2);
		btn2.setBounds(150,40,80,25);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);//让窗体居中显示
	}

	public static void main(String args[]){
		new LayoutNull();
	}
}