import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class ArrayListName {
	//Logger
	static Logger log = Logger.getLogger(ArrayListName.class);
	//Method addData
	public static ArrayList<Integer> addData() {
		PropertyConfigurator.configure("A.properties");
		log.info("Starts Method");
		ArrayList<Integer> alfinal = new ArrayList<Integer>();
		log.info("ArrayList<Integer> alfinal Created");
		ArrayList<String> al = new ArrayList<String>();
		log.info("ArrayList<String> al Created");
		al.add("Marcos_NP");
		al.add("Marcos_SRT");
		al.add("Marcos_NP");
		al.add("Marcos_CK");
		al.add("Marcos_SRT");
		al.add("Marcos_UD");
		al.add("Marcos_CK");
		al.add("Marcos_UD");
		al.add("Marcos_UD");
		log.info("successfully Created (al)");
		HashSet<String> hs = new HashSet<String>(al);
		log.info("HashSet<String> Created (hs)");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		log.info("HashMap<String, Integer> Created (hm)");
		for (String string : hs) {
			int uu = Collections.frequency(al, string);
			hm.put(string, uu);
			log.info("Hashset Cteated");
		}
		Set<String> s = hm.keySet();
		for (String key : s) {
			Integer val1 = hm.get(key);
			alfinal.add(val1);
			log.info("successfully Created (alFinal)");
		}
		System.out.println(hm);
		System.out.println(alfinal);
		log.warn("Before return statement");
		return alfinal;
	}

	
}
