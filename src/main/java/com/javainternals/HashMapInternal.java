package com.javainternals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapInternal {

	public static void main(String[] args) {
		Map<String,Integer> contacts = new HashMap<>();
        contacts.put("Raj",432543);
        contacts.put("Ravi",4546);
        contacts.put("kiran",997878);
        contacts.put("ali",44464);
        contacts.put("sure",7883);
        contacts.put("Ram",23232);

        Set<Map.Entry<String,Integer>> show = contacts.entrySet();
        Iterator<Map.Entry<String,Integer>> it = show.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
	}

}
