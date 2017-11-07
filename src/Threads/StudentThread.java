package Threads;

public class StudentThread extends Thread {
    Accout a;
    
    public StudentThread(Accout a){
    	this.a = a;
    	start();
    }
    
    public void run(){
    	try{
    		while(true){
    			Thread.sleep(2000);
    			a.getMoney(); //取钱
    		}
    	}catch(Exception e){
    		
    	}
    }
}