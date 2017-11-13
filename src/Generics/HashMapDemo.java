package Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * HashMap的增删改查操作
 * 使用迭代器使用时要用Entry接口
 * */
public class HashMapDemo {
	public static void main(String[] args) {
		//实例化一个HashMap对象
		HashMap< String,String>hashMap=new HashMap<>();
		
		//增加，这里乱序添加，看结果是不是乱序的！
		hashMap.put("a","李柏");
		hashMap.put("d","李思敏");
		hashMap.put("z","李宏云");
		hashMap.put("b","李佳");
		
		//删除key为“4”的元素。删除时，key和value都要匹配上否则是不会删除成功的
		//hashMap.remove("b", "李思敏");
		//使用一个参数的方法，注意参数是key的值，HashMap没有游标这个说法
		hashMap.remove("b");
		
		//修改  3的value换成李宏云
		hashMap.put("z", "李宏云");
		 
		
		//用迭代器查看，其他方法好像都是不行的，因为这个相当于层层封装的东西了
		Iterator<Entry<String, String>> it=hashMap.entrySet().iterator();
		while (it.hasNext()) {
			//这里Entry是个接口
			Entry<String,String>en=it.next();//next一次遍历只能取一次，否则就变味了
			String key=en.getKey();        //获得key
			String value=en.getValue();   //获得value
			System.out.println(key+" : "+value);
		}
	}
}