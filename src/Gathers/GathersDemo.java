package Gathers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/*
 * 常用集合例子
 */
public class GathersDemo {

	public static void main(String[] args) {
        testLinkedList();
        testArrayList();
        testVector();
        testStack();
        testHashSet();
        testTreeSet();

        testHashMap();
        testTreeMap();
	}

	static void testLinkedList(){
        LinkedList<String> linkedList = new LinkedList();
        for(int i = 1 ; i <= 10 ; i++){
            linkedList.add(""+i);
        }
        
        for(String s : linkedList){
            System.out.println(s);
        }
        
        for(int i = 0 ; i < linkedList.size() ; i++){
            System.out.println(linkedList.get(i));
        }
        
        System.out.println(linkedList);
    }
    
    static void testArrayList(){
        List<String> arrayList = new ArrayList();
        for(int i = 1 ; i <= 10 ; i++){
            arrayList.add(""+i*10);
        }

        for(String s : arrayList){
            System.out.println(s);
        }
        
        for(int i = 0 ; i < arrayList.size() ; i++){
            System.out.println(arrayList.get(i));
        }
        
        System.out.println(arrayList);
    }
    
    static void testVector(){
        Vector<String> vector = new Vector();
        for(int i = 1 ; i <= 10 ; i++){
            vector.add(""+i*100);
        }
        for(String s : vector){
            System.out.println(s);
        }
        
        for(int i = 0 ; i < vector.size() ; i++){
            System.out.println(vector.get(i));
        }
        
        System.out.println(vector);
    }
    
    static void testStack(){
        Stack <String> stack = new Stack();
        for(int i = 1 ; i <= 10 ; i++){
            stack.push("stack"+i);
        }
        
        while(!stack.isEmpty()){
            System.out.println(stack.lastElement());
            stack.pop();
        }
        
    }
    
    static void testHashSet(){
        Set<String> set = new HashSet();
        set.add("22");
        set.add("232");
        set.add("2234");
        set.add("1232");
        
        set.add(null);
        
        Iterator ite = set.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
    
    static void testTreeSet(){
        Set<String> set = new TreeSet();
        set.add("1234");
        set.add("232");
        set.add("22");
        set.add("232");
        //set.add(null);
        
        Iterator ite = set.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
    
    static void testHashMap(){
        Map map = new HashMap();
        map.put("map1", "1234");
        map.put("map1", "12234");
        map.put("map2", "1234");
        map.put(2, "c1234");
        
        System.out.println(map);
    }
    
    static void testTreeMap(){
        Map map = new TreeMap();
        map.put("map1", "1234");
        map.put("map1", "12234");
        map.put("map2", "1234");
        map.put("2", "c1234");
        
        System.out.println(map);
    }
}