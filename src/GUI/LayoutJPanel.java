package GUI;

import javax.swing.*;
import java.awt.*;

public class LayoutJPanel extends JFrame{
	JPanel p1,p2;	
	public LayoutJPanel()
	{
		setTitle("面板划分窗口");
		p1 = new JPanel();
		p2 = new JPanel();
		
		p1.setBackground(Color.green);
		p2.setBackground(Color.red);
		
		this.setLayout(new GridLayout(1,2,5,5)); //设置为1行2列，间隔均为5
		this.add(p1);
		this.add(p2);
		
		this.setBounds(200, 200, 300, 250);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new LayoutJPanel();
	}
}