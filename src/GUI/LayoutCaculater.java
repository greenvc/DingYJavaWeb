package GUI;

import javax.swing.*;
import java.awt.*;

public class LayoutCaculater extends JFrame{
	//定义计算器的16个按钮和一个现实内容的文本框
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JButton badd,bsub,bmul,bdec,bpoint,bequ;
	JTextField result;
	JPanel p1,p2; //定义用于划分子布局区域的两个面板
	
	public LayoutCaculater()
	{
		setTitle("计算器");
		init();
		this.setBounds(200, 200, 400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void init()
	{
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		
		badd = new JButton("+");
		bsub = new JButton("/");
		bmul = new JButton("*");
		bdec = new JButton("-");
		bpoint = new JButton(".");
		bequ = new JButton("=");
		
		result = new JTextField();
		//设置第一个面板
		p1 = new JPanel();
		p1.setLayout(new GridLayout(1,1));
		p1.add(result);
		//设置第二个面板
		p2 = new JPanel();
		p2.setLayout(new GridLayout(4,4,2,2));
		p2.add(b7); p2.add(b8); p2.add(b9); p2.add(bsub);
		p2.add(b4); p2.add(b5); p2.add(b6); p2.add(bmul);
		p2.add(b1); p2.add(b2); p2.add(b3); p2.add(bdec);
		p2.add(b0); p2.add(bpoint); p2.add(bequ); p2.add(badd);
		//将两个面板设置到窗体中。
		this.setLayout(new BorderLayout());
		this.add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);		
	}
	
	public static void main(String[] args) {
		new LayoutCaculater();
	}
}