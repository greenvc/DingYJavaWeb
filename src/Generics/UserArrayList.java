package Generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 本示例对泛型是自定义类的情况做增删改查
 *
 * */
public class UserArrayList {

	public static void main(String[] args) {
		// 这里存入集合的不是基本数据类型了，而是上面创建的User类的对象了
	       ArrayList<User> list = new ArrayList<>();
	 
	       // 添加User类的对象10个
	       for (int i = 0; i < 10; i++) {
	           list.add(new User("姓名" +i, "女", 20 + i));
	       }
	 
	       // 删除前面的五个User的对象
	 
	       /*使用for循环删除
	        *for (int i = 0; i < 5; i++) { //虽然程序没有崩掉，但是得到的结果不对
	        *list.remove(i); }//得到结果：剩下name1、name3、name5、name7、name9
	        */
	      
	       // 使用迭代器Iterator删除
	       Iterator<User> iterator =list.iterator();
	       int num = 0;
	       while (iterator.hasNext()) {
	           iterator.next();//游标指向下一个，这个很重要，没有就报错
	           iterator.remove();
	           num++;
	           if (num == 5) { // 删除前面0到4个，马上退出循环
	              break;
	           }
	       }
	      
	       //创建一个User对象
	       User meizi=new User("妹子","女",18);
	       //改变集合里面第一个元素的值
	       list.set(0, meizi);
	      
	       //显示集合里面的元素的具体属性
	       // System.out.println(list);//直接打印出现的是类名和地址，不是我们想要的结果
	       for (User user : list) {
	           System.out.println(user.getName()+"\t"+user.getSex()+"\t"+user.getAge());
	       }	 
	    }	 
	}