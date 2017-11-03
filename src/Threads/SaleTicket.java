package Threads;
import java.util.Random;

/*
 * 多线程火车售票模拟程序
 */
public class SaleTicket implements Runnable {
	public int total;
	public int count;	 

	public SaleTicket() {
		total = 10000;
		count = 0;
	}
	
	public void run() {
		while (total > 0) {
			synchronized (this) {
				if(total > 0) {
					try {
						Thread.sleep(00);
						Thread.sleep(new Random().nextInt(1000));
					} catch (InterruptedException e) {
						e.printStackTrace();				
					}
					
					count++;
					total--;
					System.out.println(Thread.currentThread().getName() + "\t销售票号：" + count);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		SaleTicket st = new SaleTicket();
		for(int i=1; i<= 20; i++) {
			new Thread(st, "售票点：" + i).start();
		}
	}
}