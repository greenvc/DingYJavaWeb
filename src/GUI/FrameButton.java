package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameButton {

	public static void main(String[] args) {
		// 创建JFrame
		JFrame frame = new JFrame("我的frame");

		// 创建按钮
		JButton button = new JButton("确定");
		button.setSize(130, 30);
		// 向frame中添加一个按钮
		frame.add(button);

		// 设置尺寸
		frame.setSize(200, 100);
		// JFrame在屏幕居中
		frame.setLocationRelativeTo(null);
		// JFrame关闭时的操作
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 显示JFrame
		frame.setVisible(true);
	}
}