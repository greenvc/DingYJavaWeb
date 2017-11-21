package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * 菜单示例
 */
public class MenuDemo extends JFrame
{
	   public MenuDemo()
	   {
	      super("菜单示例");
	      // 菜单栏
	      JMenuBar menuBar = new JMenuBar();
	      //主菜单
	      JMenu menu = new JMenu("文件(F)");
	      // 设置助记符为F，按下ALT + F 可以触发该菜单
	      menu.setMnemonic('F');

	      //二级菜单
	      JMenuItem newItem = new JMenuItem("新建");
	      JMenu open = new JMenu("打开(O)");
	      open.setMnemonic('O');
	      JMenuItem quit = new JMenuItem("退出");

	      menu.add(newItem);

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
	      JMenuItem pop1 = new JMenuItem("复制");
	      JMenuItem pop2 = new JMenuItem("编辑");
	      objPpopupMenu.add(pop1);
	      objPpopupMenu.addSeparator();
	      objPpopupMenu.add(pop2);
	      
	      JTextArea textArea = new JTextArea();
	      // 添加鼠标事件监听器，使用适配器
	      textArea.addMouseListener(new MouseAdapter() {
	         public void mouseReleased(MouseEvent e)
	         {
	            if (e.isPopupTrigger())
	            {
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