package practice_project;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public  class MainClass{
	public static void main(String[] args){
	Map<Integer,String> data1 =new HashMap<>();
	Map<Integer,String> data =new HashMap<>();
	
	data1.put(1,"ram");
	data1.put(2,"abc");
	data1.put(3,"xyz");
	data1.put(4,"tom");
	data1.put(5,"cat");
	
	data.putAll(data1);
	
	data1.replace(2,"two");
    data.remove(4);
    data.remove(5,"cat");
    
	
	data1.putIfAbsent(6,"mohan");
	
	
	
		
		
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data1.get(3));
		System.out.println(data1.getOrDefault(7,"not exist"));
		System.out.println(data1.containsKey(4));
		System.out.println(data1.containsValue("hi"));
		
		System.out.println(data1.keySet());
		System.out.println(data1.values());
		System.out.println(data1.entrySet());
		
		
	
	}
}
