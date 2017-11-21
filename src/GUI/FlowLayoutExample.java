package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class FlowLayoutExample {
	public static void main(String []args){
		JFrame f=new JFrame("流式布局");
		JPanel p=new JPanel();
		//将面板的布局设置为流式布局，布局中的放置的控件左对齐排列
		//横向间距为20，纵向间距为10
		p.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));	
		JButton btnOne=new JButton("按钮一");
		JButton btnTwo=new JButton("按钮二");
		JButton btnThree=new JButton("按钮三");
		JButton btnFour=new JButton("按钮四");
		JButton btnFive=new JButton("按钮五");		
		p.add(btnOne);
		p.add(btnTwo);
		p.add(btnThree);
		p.add(btnFour);
		p.add(btnFive);
		f.add(p);
		f.setSize(300,200);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);		
	}
}