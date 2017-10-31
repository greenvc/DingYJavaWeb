package Threads;

/*
 * 继承Thread类创建线程
 */
public class ThreadDemo1 extends Thread
{
	public ThreadDemo1(){
	  
	}
	
	public ThreadDemo1( String name ){
	   super( name );
	}
    
	public void run(){
	   int i = 0;
	   while(i < 30){
		  i++;
	      System.out.println( this.getName() + " "+ " : i = " + i);
		  System.out.println( Thread.currentThread().getName() + " "+ " : i = " + i);
		  System.out.println( Thread.currentThread() == this );
		  System.out.println( "获取的线程ID是： " + super.getId() );
		  System.out.println( "线程对象的优先级是：" + super.getPriority() );
	   }
	}
	
	public static void main(String[] args) 
	{
        ThreadDemo1 th1 = new ThreadDemo1("线程1");
		ThreadDemo1 th2 = new ThreadDemo1("线程2");
        // 设置线程名
        th1.setName( "th1" );
		th2.setName( "th2" );
        // 设置线程优先级  1 ~ 10
		th1.setPriority( 10 ); 
		th2.setPriority( 7 ); 
		// 查看SUN定义的线程优先级范围
		System.out.println("max : " + Thread.MAX_PRIORITY );
		System.out.println("min : " + Thread.MIN_PRIORITY );
        System.out.println("nor : " + Thread.NORM_PRIORITY );
		th1.start();
		th2.start();
		System.out.println("Java 线程示例。。。。。。");
	}

}