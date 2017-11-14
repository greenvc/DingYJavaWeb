package Gathers;

import java.io.IOException;
import java.util.*;

/*
 * 彩票程序
 */
public class Lottery {

	public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        // 随机生成7个不重复的数
        int[] r = new int[7];
        boolean[] b = new boolean[31]; // 记录该数是否已经生成
        for (int i = 0; i < 7; i++) {
            int tem = (int) (Math.random() * 30) + 1;
            while (b[tem] == true)
                tem = (int) (Math.random() * 30) + 1;
            r[i] = tem;
            b[tem] = true;
        }
        // 输入7个数
        System.out.println("请输入1至30的七个数字：");
        int[] in = new int[7];
        for (int i = 0; i < 7; i++) {
            in[i] = objScanner.nextInt();
        }
        // 打印生成的7个随机数
        System.out.println("系统随机数是：");
        for (int i = 0; i < 7; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();
        // 打印你输入的7个数
        System.out.println("您输入的数字是：");
        for (int i = 0; i < 7; i++) {
            System.out.print(in[i] + " ");
        }
        System.out.println();
        // 打印相同的数
        int count = 0;
        System.out.println("数字相同的是：");
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 7; j++) {
                if (in[i] == r[j]) {
                    System.out.println(in[i] + " ");
                    count++;
                }
            }
        switch (count) {
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println("谢谢惠顾！");
            break;
        case 5:
            System.out.println("三等奖");
            break;
        case 6:
            System.out.println("二等奖");
            break;
        case 7:
            System.out.println("一等奖");
            break;
        }
        System.out.println();
    }
}