package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFileDialog extends JFrame {
	MyFileDialog(String title) {
		super(title);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}

public class FileDialogDemo {
	public static void main(String args[]) {
		Frame f = new MyFileDialog("文件对话框示例");
		f.setVisible(true);
		f.setSize(100, 100);
		FileDialog fd = new FileDialog(f, "打开文件：");
		fd.setVisible(true);
	}
}
