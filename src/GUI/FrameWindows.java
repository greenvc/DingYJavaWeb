package GUI;

import javax.swing.JFrame;

public class FrameWindows {

	public static void main(String[] args) {
		// 创建JFrame
		JFrame frame = new JFrame("第一个Windows应用程序");
		// 设置尺寸
		frame.setSize(800, 600);
		// JFrame在屏幕居中
		frame.setLocationRelativeTo(null);
		// JFrame关闭时的操作
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 显示JFrame
		frame.setVisible(true);
	}
}