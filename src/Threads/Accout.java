package Threads;

/*
 * 在常见的多线程问题解决中，同步问题的典型示例是“生产者-消费者”模型，也就是生产者线程只负责生产，消费者线程只负责消费，在消费者发现无内容可消费时则睡觉。下面举一个比较实际的例子——生活费问题。
 *  学生生活费问题是这样的：学生每月都需要生活费，家长一次预存一段时间的生活费，家长和学生使用统一的一个帐号，在学生每次取帐号中一部分钱，直到帐号中没钱 通知家长存钱，而家长看到帐户还有钱则不存钱，直到帐户没钱时才存钱。在这个例子中，这个帐号被学生和家长两个线程同时访问，则帐号就是临界资源，两个线 程是同时执行的，当每个线程发现不符合要求时则等待，并释放分配给自己的CPU执行时间，也就是不占用系统资源。 
 */
public class Accout {
    int money = 0;
    
    /**
     * 取钱
     * 如果账户没钱则等待，否则取出所有钱提醒存钱
     */
    public synchronized void getMoney(){
    	System.out.println("准备取钱！");
    	try{
                       if(money == 0){
                                wait(); //等待
                       }
                       //取所有钱
                       System.out.println("剩余:" + money);
                       money -= 50;
                       //提醒存钱
                       notify();
              }catch(Exception e){}                
    }
    
    /**
     * 存钱
     * 如果有钱则等待，否则存入200提醒取钱
     */
    public synchronized void saveMoney(){
              System.out.println("准备存钱！");
              try{
                       if(money != 0){
                                wait(); //等待
                       }
                       //取所有钱
                       money = 200;
                       System.out.println("存入:" + money);
                       //提醒存钱
                       notify();
              }catch(Exception e){}                
    }
    

    public static void main(String[] args) {
    	Accout a = new Accout();
    	StudentThread s = new StudentThread(a);
    	GenearchThread g = new GenearchThread(a);
    }
}