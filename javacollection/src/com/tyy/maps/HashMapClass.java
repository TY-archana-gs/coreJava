package com.tyy.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {
		
		HashMap<Integer, String> has= new HashMap<Integer, String>();
		
		has.put(1, "Archana");
		has.put(5, "Amuu");
		has.put(2, "Bhakthi");
		has.put(4, "Chiru");
		has.put(3, "pune");
/*		
    List<Entry<Integer,String>> list= new ArrayList<Entry<Integer,String>>(has.entrySet());
		
    Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

		@Override
		public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
			return o1.getKey()-o2.getKey();
		}

	});
		
    for (Entry<Integer, String> entry : list) {
    	System.out.println(entry);
    }}

}*/
  Set<Integer> s=has.keySet();

System.out.println(s);

String name=has.get(4); 
System.out.println(name);

Iterator<Integer> itr = s.iterator();

while(itr.hasNext()) {

Integer ele= (Integer) itr.next();

System.out.println(ele);

}}}
