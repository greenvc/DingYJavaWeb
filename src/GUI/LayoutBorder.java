package GUI;

import javax.swing.*;
import java.awt.*;

public class LayoutBorder{
	public static void main(String []args){
		JFrame f=new JFrame("边界布局");
		f.setLayout(new BorderLayout(10,10));
		f.add(new JButton("北"),BorderLayout.NORTH);
		f.add(new JButton("南"),BorderLayout.SOUTH);
		f.add(new JButton("东"),BorderLayout.EAST);
		f.add(new JButton("西"),BorderLayout.WEST);
		f.add(new JButton("中"),BorderLayout.CENTER);
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);					
	}
}