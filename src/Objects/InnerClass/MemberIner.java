package Objects.InnerClass;

public class MemberIner {
    private String member="这是外部类变量";
    //成员内部类
    //不对外开放，高内聚
    class Child {
        public Child() {//当内部类的构造器为Protected、private修饰时外部类外不可以访问
            
        }
        public void go(){
            System.out.println("这是内部类Child的go方法 " + MemberIner.this.member);//内部类访问外部类变量
        }
    }
    
    
    //可供成员的外部类中其他方法调用
    public  Child show(){
        
        return this.new Child();//外部类调用
        
    }
    
    public static void main(String[] args) {
        
    	Child objChild = new MemberIner().show();
    }
}