package Threads;
/**
 * 访问数据的线程
 */
public class DataThread extends Thread {
    Data data;
    String name;
    
    public DataThread(Data data,String name){
    	this.data = data;
    	this.name = name;
    	start();
    }
     
    public void run(){
    	try{
    		for(int i = 0;i < 10;i++){
    			data.action(name);
    			Thread.sleep(100);
    		}
    	}catch(Exception e){
    		
    	}
    }
}