package Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * HashMap的增删改查操作
 * 使用迭代器使用时要用Entry接口
 * */
public class UserHashMap {

	public static void main(String[] args) {
		//实例化一个HashMap对象
		HashMap< Integer,User>hashMap=new HashMap<>();
		//创建一个User对象
		User user=new User("name1", "男", 19);
		//增加，这里乱序添加，看结果是不是乱序的！
		hashMap.put(1,user);
		hashMap.put(4,new User("name4", "女", 18));
		hashMap.put(2,new User("name2", "女", 22));
		hashMap.put(7,new User("name7", "女", 20));
		
		//删除key为“1”的元素。删除时，key和value都要匹配上否则是不会删除成功的
		//两个参数的情况
		//这里的user如果换成User("name1", "男", 19);不能删除成功，这也可能比较的是地址！！
		//hashMap.remove(1,user);		
		
		//但是删除使用的是一个参数的方法，可以只输入key的值，注意这里不是游标的值
		hashMap.remove(1);
		
		//修改  2的value换成new User("meizi", "女", 19)
		hashMap.put(2, new User("mei", "女", 19));
		
		//用迭代器查看，其他方法好像都是不行的，因为这个相当于层层封装的东西了
		Iterator<Entry<Integer, User>> it=hashMap.entrySet().iterator();
		while (it.hasNext()) {
			//这里Entry是个接口
			Entry<Integer, User>en=it.next();//next一次遍历只能取一次，否则就变味了
			int key=en.getKey();        //获得key
			User value=en.getValue();   //获得value,但是User类型的对象
			//String name=value.getName();   //获得name,同样可以获得sex和age
			System.out.println(key+" : "+value.toString());
		}
	}
}