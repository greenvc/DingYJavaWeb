package GUI;

import javax.swing.JOptionPane;

public class InfoDialog {
	public InfoDialog() {
		
	}
	
	/**
	 * 普通消息框
	 * @param Msg 消息内容
	 */
	public void ShowMsg(String Msg) {
		JOptionPane.showMessageDialog(null, Msg, "提示信息", JOptionPane.INFORMATION_MESSAGE);
	}
		
	/**
	 * 确认消息框
	 * @param Msg 消息内容
	 * @return 0为点击yes，否则点击NO或关闭
	 */
	public int ConfirmMsg(String Msg) {
		return JOptionPane.showConfirmDialog(null, Msg, "确认信息", JOptionPane.YES_NO_OPTION);
	}
	
	/**
	 * 输入选择框
	 * @param Msg 待选择的字符串数组
	 * @return 选中的字符串
	 */
	public Object InputMsg(Object[] Msg) {
		 return JOptionPane.showInputDialog(null, "请选择一个字符串", "选择输入",  JOptionPane.INFORMATION_MESSAGE, null,  Msg, Msg[0]);
	}
	
	public static void main(String[] args)
	{
		new InfoDialog().ShowMsg("请输入有效的电话号码？");
		
		new InfoDialog().ConfirmMsg("输入为空是否继续, 是否继续");		
		
		Object[] possibleValues = { "北京市", "上海市", "重庆市", "云南省", "四川省" }; 
		System.out.println(new InfoDialog().InputMsg(possibleValues));
	}
}