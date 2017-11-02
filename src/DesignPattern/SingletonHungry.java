package DesignPattern;

/** 
 * 单例模式的实现：饿汉式,线程安全 但效率比较低 
 */  
public class SingletonHungry {
	private SingletonHungry() {  
    }  
  
    private static final SingletonHungry instance = new SingletonHungry();  
  
    public static SingletonHungry getInstancei() {  
        return instance;  
    }  
}