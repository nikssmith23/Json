
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapName {
	public static HashMap<String, Integer> addData() {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Marcos_NP");
		al.add("Marcos");
		al.add("Marcos_NP");
		al.add("Marcos_CK");
		al.add("Marcos");
		al.add("Marcos_UD");
		al.add("Marcos_CK");
		al.add("Marcos_UD");
		al.add("Marcos_UD");
		HashSet<String> hs = new HashSet<String>(al);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String string : hs) {
			int uu = Collections.frequency(al, string);
			hm.put(string, uu);
		}
		System.out.println(hm);
		return hm;
	}

	public static void main(String[] args) {
		addData();
	}
}
