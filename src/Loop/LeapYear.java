package Loop;
import java.util.Scanner;

/*
 * 计算是否为闰年
 */
public class LeapYear {
	
	public static void main(String[] args)
	{
		System.out.println("请输入一个年份，求该年份是否为闰年，闰年能被4整除但不能被100整除，或者能被400整除");
		int a = new Scanner(System.in).nextInt();
		if (a <= 0)
		{
			System.out.println("你输入的年份有误，程序退出");
			System.exit(0);
		}
		else if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
		{
			System.out.println("你输入的年份为闰年");
		}
		else
		{
			System.out.println("你输入的年份不是闰年");
		}
	}
}