package Files;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;  
import java.io.ObjectInputStream;  

/**
 * 实现具有序列化能力的类
 * */
public class Person implements Serializable {
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "姓名：" + name + "  年龄：" + age;
	}

	private String name;
	private int age;
	
/**
 * 
 * */
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Temp\\txt.txt");
		//序列化一个对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(new Person("DingY", 23));
		oos.close();
		
		 //反序列化对象
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));  
        Object obj = input.readObject();  
        input.close();  
        System.out.println(obj);  
	}
}