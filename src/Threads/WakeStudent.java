package Threads;
/*
 * 编写一个Java应用程序，要求有3个线程：studentl、student2和teacher，其中线程studentl准备“睡”20分钟后再开始上课， 
线程student2准备“睡”一小时后再开始上课。teacher在输出4句“上课”后，“唤醒”了休眠的线程studentl； 
线程studentl被“唤醒”后，负责再“唤醒”休眠的线程student2。
*/
public class WakeStudent {
   public static void main(String[] args) {
	   Wake wake = new Wake();
       Thread student1, student2, teacher;
       student1 = new Thread(wake);
       student1.setName("shuishen1"); // 睡神一
       student2 = new Thread(wake);
       student2.setName("shuishen2"); // 睡神二
       teacher = new Thread(wake);
       teacher.setName("disruptsleep");// 睡神杀手。

       student1.start();
       student2.start();
       teacher.start(); // 启动三个进程（刚编的时候忘了写，要注意！！！）
   }
}

class Wake implements Runnable {
	// 0为安全;1为老师发飙;2为学生student1被叫醒，然后student1不得不叫旁边睡觉的student2
	public static int alert = 0; 

	public void run() {
		String name = Thread.currentThread().getName();
		// 线程student1
		if (name.equals("shuishen1")) {
			while (alert == 0) {
               System.out.println("睡神一说：先睡20分钟再说，反正这老师也不点名");
               Thread.yield();
           }

           while (alert == 1) {
               System.out.println("睡神一说：我起来听课了，我去叫旁边的睡神二");
               alert = 2;
           }
       }
       
       // 线程student2
       if (name.equals("shuishen2")) {

           if (alert != 2) {
               System.out.println("睡神二说：先睡一个小时再说，老师点名了有睡神一叫我起来");
               Thread.yield();
               }
            else {
               System.out.println("老师和睡神一都在看我，不好不起来听课了！");
           }
       }
       
       // 线程teacher
       if (name.equals("disruptsleep")) {
           for (int i = 0; i < 4; i++) {
               System.out.println("上课！！！不准睡觉！！！");
           }
           alert = 1;
       }
   }
}