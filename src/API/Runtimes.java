package API;

/*
 * 应用程序运行的环境
 */
public class Runtimes {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
        long mem1,mem2;
        Integer someints[] = new Integer[1000];
        System.out.println("JVM使用的总容量 ：" + r.totalMemory());
        mem1 = r.freeMemory();
        System.out.println("可用内存：" + mem1);
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection : " + mem1);
        //allocate integers
        for(int i=0; i<1000; i++) someints[i] = new Integer(i);
        mem2 = r.freeMemory();
        System.out.println("Free memory after allocation : " + mem2);
        System.out.println("Memory used by allocation : " +(mem1-mem2));
        //discard Intergers
        for(int i=0; i<1000; i++) someints[i] = null;
        r.gc(); //request garbage collection
        mem2 = r.freeMemory();
        System.out.println("Free memory after collecting " + "discarded integers : " + mem2);
        
        //执行Notepad程序
        Process p = null; 
        try{ 
                p = r.exec("notepad"); 
        } catch (Exception e) { 
                System.out.println("Error executing notepad."); 
        } 
	}

}
