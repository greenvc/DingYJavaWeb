package Basic;

import java.util.Scanner;

/**
 * 提示用户输入一个整数。如果该整数是5的倍数，打印“5的倍数”如果是2的倍数打印“2的倍数”
 * @author dingy
 * 
 */
public class Multiple {
	public static void main(String[] args) {
		System.out.println("请输入一个整数：");
		Scanner objScanner =new Scanner(System.in);
		int nextInt = objScanner.nextInt();
		if(nextInt%5==0){
			System.out.println("是5的倍数！");
		}
		if(nextInt%2==0){
			System.out.println("是2的倍数！");
		}
		else
		{
			System.out.println("是个奇数！");
		}
		objScanner.close();
	}
}