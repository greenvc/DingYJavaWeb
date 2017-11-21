package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * 菜单示例
 */
public class MenuDemo extends JFrame
{
	private static final long serialVersionUID = 1L;
	JTextArea textArea;
	
	public MenuDemo(){
		super("菜单示例");
	      
		// 菜单栏
	      JMenuBar menuBar = new JMenuBar();
	      //主菜单
	      JMenu menu = new JMenu("文件(F)");
	      // 设置助记符为F，按下ALT + F 可以触发该菜单
	      menu.setMnemonic('F');
	
	      //二级菜单
	      JMenuItem objNewMenu = new JMenuItem("新建");
	      objNewMenu.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent e)
	          {
	    		  textArea.setText("点击新建菜单，在文本框中输入字符串......");
	          }
	      });
	      menu.add(objNewMenu);
	      
	      JMenu open = new JMenu("打开(O)");
	      open.setMnemonic('O');
	      JMenuItem quit = new JMenuItem("退出");
	
	
	      //三级菜单
	      JMenuItem docMenu = new JMenuItem("文档");
	      docMenu.setMnemonic('w');
	      JMenuItem codeMenu = new JMenuItem("代码");
	      codeMenu.setMnemonic('c');
	      open.add(docMenu);
	      open.add(codeMenu);
	      
	      menu.add(open);
	      // 设置菜单分隔符
	      menu.addSeparator();
	      menu.add(quit);
	
	      menuBar.add(menu);
	
	      //设置菜单栏，使用这种方式设置菜单栏可以不占用布局空间
	      setJMenuBar(menuBar);
	
	      // 以上为普通菜单，菜单还有一种为弹出式菜单，通过鼠标右击弹出
	      final JPopupMenu objPpopupMenu = new JPopupMenu();
	      JMenuItem objCopy = new JMenuItem("复制");
	      
	      objCopy.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent e)
	          {
	    		  JOptionPane.showMessageDialog(null, "点击的是弹出菜单之复制功能", "提示消息", JOptionPane.INFORMATION_MESSAGE);
	          }
	      });
	      objPpopupMenu.add(objCopy);	      
	
	      objPpopupMenu.addSeparator();
	      
	      JMenuItem objEdit = new JMenuItem("编辑");	      
	      objEdit.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent e)
	          {
	    		  JOptionPane.showMessageDialog(null, "编辑功能", "提示消息", JOptionPane.ERROR_MESSAGE);
	          }
	      });
	      objPpopupMenu.add(objEdit);
	      
	      JMenuItem objDel = new JMenuItem("删除");	  
	      objPpopupMenu.add(objDel);
	      
	      textArea = new JTextArea();
	      // 添加鼠标事件监听器，使用适配器
	      textArea.addMouseListener(new MouseAdapter() {
	    	  public void mouseReleased(MouseEvent e)
	    	  {
	    		  if (e.isPopupTrigger()){
	    			  // 显示弹出式菜单
	            	objPpopupMenu.show(e.getComponent(), e.getX(), e.getY());
	    		  }
	    	  }
	      });
	      
	      add(new JScrollPane(textArea));
	
	      setSize(400, 300);
	      setLocationRelativeTo(null);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      setVisible(true);
	   }
	
	   public static void main(String[] args)
	   {
	      new MenuDemo();
	   }
}