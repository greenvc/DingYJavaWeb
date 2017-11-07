package Threads;

import java.util.LinkedList;
/*
 * 实现一个线程池类，其中客户机类等待一个可用线程、将任务传递给该线程以便执行、然后在任务完成时将线程归还给池，一般一个简单线程池至少包含下列组成部分
 * 线程池管理器（ThreadPoolManager）：用于创建并管理线程池
 * 工作线程（WorkThread）： 线程池中线程
 * 任务接口（Task）：每个任务必须实现的接口，以供工作线程调度任务的执行。
 * 任务队列：用于存放没有处理的任务。提供一种缓冲机制。
 */
public class WorkQueue {
	private final int nThreads;
	private final PoolWorker[] threads;
	private final LinkedList queue;
	public WorkQueue(int nThreads) {
		this.nThreads = nThreads;
		queue = new LinkedList(); 
		threads = new PoolWorker[nThreads];
		for (int i = 0; i < nThreads; i++) {
			threads[i] = new PoolWorker();
			threads[i].start();
		}
	}

	public void execute(Runnable r) {
		synchronized (queue) {
			queue.addLast(r);
			queue.notify();
		}
	}

	private class PoolWorker extends Thread {
		public void run() {
			Runnable r;
			while (true) {
				synchronized (queue) {
					while (queue.isEmpty()) {
						try {
							queue.wait();
						} catch (InterruptedException ignored) {
						}
					}
					
					r = (Runnable) queue.removeFirst(); 
				}
				
				// If we don't catch RuntimeException,  the pool could leak threads
				try {
					r.run();
				} catch (RuntimeException e) {
					// You might want to log something here 
				} 
			}
		} 
	}

	public static void main(String args[]) {
		WorkQueue wq = new WorkQueue(3);
		wq.execute(new Runnable() {
			public void run() { 
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						
					}
					System.out.println("这是线程：" + i); 
				}
			}
		});
	} 
}