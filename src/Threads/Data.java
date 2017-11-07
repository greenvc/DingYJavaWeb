package Threads;

/**
 * 如果多个线程同时访问一个资源，例如变量、文件等，时如何保证访问安全的问题。在多线程编程中，这种会被多个线程同时访问的资源叫做临界资源。
 * 模拟临界资源的类
 */
public class Data {
    public int n;
    
    public Data(){
    	n = 20;
    }
   
    public synchronized void action(String name){
    	System.out.println(name + ":" + n);
    	n--;
    }
    
    /**
     * 测试多线程访问时的问题
     */
    public static void main(String[] args) {
    	Data data = new Data();
    	DataThread d1 = new DataThread(data,"线程1");
    	DataThread d2 = new DataThread(data,"线程2");
    }
}