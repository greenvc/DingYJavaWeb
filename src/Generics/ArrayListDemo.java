package Generics;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    /**
     * ArrayList增删改查的操作
     * */
	public static void main(String[] args) {
		//实例化ArrayList，泛型是基本类型String，添加的数据只能是String，否者报错
		ArrayList<String>list=new ArrayList<>();
	      
	   //添加操作
	   list.add("123");
	   //list.add(12);//会报错
	   list.add("小明");
	   list.add("妹子");
	   list.add("帅哥");
	  
	   //删除操作
	   list.remove(1);//以游标的方式，删除第二个数据“小明”
	   list.remove("妹子");//以实际集合的内容，删除第三个数据“妹子”
	  
	   //数据修改
	   list.set(0, "222");//把第一个元素的内容改为“222”了
	  
	   //显示集合内的数据
	   //集合剩下“222”、“帅哥”这两页元素了
	  
	   //显示方法1:
	   //System.out.println(list);//最简单的显示方法
	  
	   //显示方法2:
	   /*for (int i = 0; i <list.size(); i++) {
	       System.out.println(list.get(i));
	   }*/
	  
	   //显示方法3:
	   /*for (String string : list) {
	       System.out.println(string);
	   }*/
	  
	   //显示方法4：基本数据类型的泛型使用  迭代器Iterator接口的使用
	   Iterator<String> iterator=list.iterator();
	   while (iterator.hasNext()) {
	       System.out.println(iterator.next());
	   }
	}

}