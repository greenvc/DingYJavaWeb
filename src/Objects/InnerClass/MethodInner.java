package Objects.InnerClass;

public class MethodInner {
	
	class LocalClass {        
        public  void noProblem() {
            System.out.println("患有急性短暂失常症,开车撞死人没事");

        }

    }
    
    private String member ="全局变量";
    final int n=4;
    public void driver(){
        final String member2 ="局部变量";//方法内的变量只有final变量才能被方法内部类访问
        System.out.println("我正在开车, " + member);
        
        //每个内部类都能独立地继承自一个（接口的）实现，所以无论外围类是否已经继承了某个（接口的）实现，
        //对于内部类都没有影响
        //内部类使得多重继承的解决方案变得完整。接口解决了部分问题，而内部类有效地实现了“多重继承”
        //短暂，不对外，防止变成全局
        class B extends LocalClass {
            public void show(){
                System.out.println(member2+4);
            }
        }
        new B().noProblem();//方法内部类里的方法只能在方法里调用
        new B().show();
        
        System.out.println("一切恢复正常");
        
    }
    
    public static void main(String[] args) {
        new MethodInner().driver();
    }

}