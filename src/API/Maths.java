package API;

import java.util.ArrayList;
import java.util.Random;

/*
 * 数学类
 */
public class Maths {

	public static void main(String[] args) {
		//四舍五入
		System.out.println("11.5 四舍五入：" + Math.round(11.5));  
		
		//对于种子相同的Random对象，生成的随机数序列是一样的。
        Random objRandom = new Random(10);
        System.out.println("使用种子为10的Random对象生成[0,10)内随机整数序列: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(objRandom.nextInt(10) + " ");
        }
        System.out.println();

        //直接使用Random无法避免生成重复的数字，如果需要生成不重复的随机数序列，需要借助数组和集合类
        ArrayList objArrayList = new Maths().getDiffNumber(10);
        System.out.println();
        System.out.println("产生的n个不同的随机数："+objArrayList);
	}
	
	 /**
     * 生成n个不同的随机数，且随机数区间为[0,10)
     * @param n
     * @return
     */
    public ArrayList getDiffNumber(int n){
        // 生成 [0-n) 个不重复的随机数
        // list 用来保存这些随机数
        ArrayList list = new ArrayList();
        Random rand = new Random();
        boolean[] bool = new boolean[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            do {
                // 如果产生的数相同继续循环
                num = rand.nextInt(n);
            } while (bool[num]);
            bool[num] = true;
            list.add(num);
        }
        return list;
    }
}