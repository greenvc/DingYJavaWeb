package Objects.InnerClass;

public class MemberInerTest {

	public static void main(String[] args) {
        new MemberIner().show();
        
        (new MemberIner()).new Child().go();//外部类外访问内部类

	}
}