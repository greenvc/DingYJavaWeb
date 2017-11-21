package GUI;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame{
	private JButton[] btn = new JButton[9];
  
    public GridLayoutExample(){	
    	init();
    	setBounds(200, 200, 300, 200);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    }
    
    public void init()
    {
    	setTitle("网格布局");
    	btn[0]=new JButton("按钮 A");
        btn[1]=new JButton("按钮 B");
        btn[2]=new JButton("按钮 C");
        btn[3]=new JButton("按钮 D");
        btn[4]=new JButton("按钮 E");
        btn[5]=new JButton("按钮 F");
        btn[6]=new JButton("按钮 G");
        btn[7]=new JButton("按钮 H");
        btn[8]=new JButton("按钮 I");        
        
        setLayout(new GridLayout(3,3));   
        for(int i=0;i<btn.length;i++){ 
      	  add(btn[i]);
        }	
    }
    
    public static void main(String args[]){	
    	GridLayoutExample win = new GridLayoutExample ();
  }
}