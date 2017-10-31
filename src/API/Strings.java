package API;

/*
 * 内置字符串函数
 */
public class Strings {

	public static void main(String[] args) {
		StringBuffer objStringBuffer = new StringBuffer();
		objStringBuffer.append("The Java");
		objStringBuffer.insert(4, "is ");
		
		System.out.println(objStringBuffer.toString());

	}

}