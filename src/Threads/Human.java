package Threads;

/*
 * 学院有一间心理辅导室，，这个辅导室会被多个人同时使用，在实际使用时，当一个人进入辅导室时则会把辅导室门锁上，等出来时打开门，下一个人进去把门锁上，如果有一个人在辅导室内部则别人发现门是锁的则只能在外面等待。从编程的角度来看，这里的每个人都可以看作是一个线程对象，而这个辅导室对象由于被多个线程访问，就是临界资源，在一个线程实际使用时，使用synchronized关键将临界资源锁定，当结束时，释放锁定
 */
public class Human extends Thread {
    Counseling t;
    String name;
    public Human(String name, Counseling t){
    	this.name = name;
    	this.t = t;
    	start(); //启动线程
    }
   
    public void run(){
    	//坐入座位中
    	t.enter(name);
    }

    public static void main(String[] args) {
        Counseling t = new  Counseling(); //座位对象
        Human h1 = new Human("张强",t);
        Human h2 = new Human("王佳",t);
        Human h3 = new Human("李丽",t);
    }
}