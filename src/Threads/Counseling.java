package Threads;

public class Counseling {

    public synchronized void enter(String name){
    	System.out.println(name + "：已经进入......");
    	try{
    		Thread.sleep(2000);
    	}catch(Exception e){
    		
    	}
    	
    	System.out.println(name + "：离开！");
    }
}