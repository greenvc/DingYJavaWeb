package Threads;

public class GenearchThread extends Thread {
    Accout a;
    public GenearchThread(Accout a){
    	
    	this.a = a;
    	start();
    }
    
    public void run(){
    	try{
    		while(true){
    			Thread.sleep(12000);
    			//存钱
    			a.saveMoney(); 
    		}
    	}
    	catch(Exception e){
    	}
    }
}