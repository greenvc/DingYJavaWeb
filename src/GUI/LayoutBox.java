package GUI;

import javax.swing.*;
import java.awt.*;

public class LayoutBox extends JFrame{
	JButton btnOne=new JButton("按钮一");
	JButton btnTwo=new JButton("按钮二");
	JButton btnThree=new JButton("按钮三");
	JButton btnFour=new JButton("按钮四");
	JButton btnFive=new JButton("按钮五");	

	public LayoutBox(String title)
	{
		init();
		setTitle(title);
		setBounds(200,200,400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init()
	{
		//Box box=new Box(BoxLayout.X_AXIS); //横向排列
		Box box=new Box(BoxLayout.Y_AXIS); //纵向排列
		this.add(box);
		box.add(btnOne);
		box.add(btnTwo);
		box.add(btnThree);
		box.add(btnFour);
		box.add(btnFive);
	}

	public static void main(String[] args) {
		LayoutBox box =new LayoutBox("箱式布局");
	}
}