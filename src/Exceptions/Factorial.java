package Exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 阶乘计算异常
 */
public class Factorial {

	public static void main(String[] args) {
		try{ 
			System.out.println("请输入一个整数");
			Scanner objScanner = new Scanner(System.in);
			String number = objScanner.nextLine();
			Long a= null;
			try{
				a = Long.parseLong(number);
			} 
			catch(NumberFormatException ex)
			{
				System.out.println("您输入的不是一个整数字符串，");
			}
			
			if(a >20) {
				throw new RuntimeException("数字过大，无法计算"); 
			}
			long result = factorial(a); 
			System.out.println("阶乘计算结果是：" + result); 
		}
		catch(Exception e){
			throw new RuntimeException(e);
        }
		finally{
            System.out.println("完成阶乘的计算"); 
        }
	} 
	
	//计算阶乘
	public static long  factorial(long n) {
		if(n==1) {
			return 1 ; 
		}

		return n * factorial(n-1); 
	} 


}