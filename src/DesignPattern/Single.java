package DesignPattern;

/*
 * 单例模式
 */
public class Single {
	//声明本类的一个私有的成员变量
		private static Single single;
		
		//第一步 : 私有化构造方法
		private Single(){
			
		}
		 //  第三步：提供一个公共的方法获取该类的实例对象
		public static Single getInstance(){
			if(single==null){
			synchronized (single) {			
					if(single==null){
						 single = new Single();
					}
				}
			}
			return single;
		}
}