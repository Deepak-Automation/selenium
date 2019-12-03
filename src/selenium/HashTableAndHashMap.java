package selenium;
import java.util.*;

public class HashTableAndHashMap {

	public static void main(String[] args) {
		
		//this is operations of hashtable
		//hashtable is non synchronised and thread safe
		//in hashtable each key is treated as an object having hashcode value
		
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("d", "deepak");
		ht.put("f", "name");
		ht.put("g", "fff");
		
		Set s = ht.entrySet();
		System.out.println(s);
		System.out.println(ht.contains("deepak"));
		
		Hashtable ht1 = new Hashtable();
		Hashtable ht2 = new Hashtable();
		ht1.put(1, "deepak");
		ht1.put(3, "name");
		ht1.put(2, "fff");
		System.out.println(ht1.entrySet());
		ht2= (Hashtable) ht1.clone();
		System.out.println(ht2.entrySet());
		System.out.println(ht1.hashCode());
		System.out.println(ht2.hashCode());
		System.out.println(ht.hashCode());
		Enumeration e = ht1.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		
		
		
		
		
		//hashmap operations
		HashMap hm = new HashMap();
		hm.put(1, "ram");
		hm.put(2, "rot");
		hm.put(3, "sot");
		Set s1 = hm.entrySet();
		System.out.println(s1);
		
		
		

	}

}
