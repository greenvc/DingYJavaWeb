package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 使用异常
 */
public class UseException {

	public static void main(String[] args) {
		System.out.println("请输入一个整数字符串:");
		try{
			BufferedReader objBufferedReader = new BufferedReader(new InputStreamReader (System.in));
			int a = Integer.parseInt(objBufferedReader.readLine());
			System.out.println("您输入的整数是：  "+a);    
		} 
		catch(IOException ExIO) { 
			System.out.println("IO错误。。。"); 
		}
		catch(NumberFormatException ex)
		{
			System.out.println("您输入的不是一个整数字符串，");
		}
	}
}