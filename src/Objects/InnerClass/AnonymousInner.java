package Objects.InnerClass;

/*匿名内部类（Android运用最多） */
public class AnonymousInner {

    public static void main(String[] args) {
        Doctor1 d1 = new Doctor1();
        d1.workInDay();
        d1.workInNight();
        
        Doctor2 d2 = new Doctor2();
        d2.workInDay();
        d2.workInNight();
        
        //语法格式
        //1、new 抽象类或者接口
        //2、后加大括号
        //3、实现未实现方法
        Doctor d3 = new Doctor(){
            
            //匿名内部类
            public void workInNight() {
                System.out.println("睡觉");
            }
            
        };
        
        d3.workInDay();
        d3.workInNight();
    }
}