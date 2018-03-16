package Loop;

public class Diamond {// 下面是升序的代码
    public void prit1(float c) {
        float p = c / 2;// 升序排序
        float d;// 声明行数变量
        float e;// 声明打印*号的变量
        float f;// 声明打印空格的变量
        float r;// 声明升序排序
        float s = c % 2;// 取模
        if (s == 0) {
            System.out.println("你输入的数据不能形成菱形结构");
        } else {
            for (d = 1; d <= p; d++) {
                for (f = p; f >= d; f--) {
                    System.out.print(" ");
                }
                for (e = 1; e <= d * 2 - 1; e++) {
                    if (e == 1 || e == d * 2 - 1) {
                        System.out.print("*");// 如果是第一个数和最后一个数，就输入*
                    } else {
                        System.out.print(" ");// 否则输入空格
                    }
                }
                System.out.println();
            }
        }
    }

    // 下面是打印倒序的代码
    public void prit2(float m) {
        float i;// 声明行数变量
        float j;// 声明打印*号的变量
        float k;// 声明打印空格数的变量
        float n = m / 2 + 1;// 倒序排序
        float o = m % 2;// m取模
        if (o == 0) {
            System.out.print("");
        } else {
            for (i = 1; i <= n; i++)// 行数循环；
            {
                // 打印*号前打印空格；
                for (k = 0; k < i - 1; k++) {
                    System.out.print(" ");
                }

                // 下面打印*号个数的循环；
                for (j = (n - k) * 2 - 2; j >= 1; j--)// 打印*号个数的循环；
                {
                    if (j == (n - k) * 2 - 2 || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // 打印完*号换行打印；
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
    	Diamond objDiamond = new Diamond();
        float b = 11;// 根据行数，判断是否可以组成菱形。如果是基数行可以输入对应的菱形，如果是偶数行则输出"你输入的数据不能形成菱形结构";
        objDiamond.prit1(b);
        objDiamond.prit2(b);
        
        objDiamond.draw(9);
    }
    
    /*
     * 把需要打印的菱形放在一个正方形里面，控制台打印出一个h*h的区域，找出菱形边所在的函数，逢边上的点打印"*"，其他点打印" "
     */
    public void draw(int h ){
        for(int i = 1 ;i <= h ;i++){         //逐行打印
            for(int j = 1;j <= h;j++){       //每行打印个数与行数保持一致
                //下面语句是菱形四条边的函数，在边上的坐标点，打印*，否则打印空格
                if(j == (h + 3) / 2 - i || j == (h - 1) / 2 + i || j == i - (h - 1 ) / 2 || j == (3 * h + 1) / 2 - i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }            
            }    
            System.out.println();        //第 i 行打印完换行
        }
    }
}