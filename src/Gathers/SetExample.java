package Gathers;

import java.util.*;

/*
 * HashSet 类
 */
public class SetExample {

	public static void main(String[] args) {
		Set set = new HashSet();
	    set.add("Bernadine");
	    set.add("Elizabeth");
	    set.add("Gene");
	    set.add("Elizabeth");
	    set.add("Clara");
	    System.out.println(set);
	    //输出已按字母顺序排序
	    Set sortedSet = new TreeSet(set);
	    System.out.println(sortedSet);
	}

}