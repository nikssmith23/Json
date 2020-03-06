import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

public class JsonExWrite {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void test() throws FileNotFoundException {

		JSONObject jo = new JSONObject();
			
		jo.put("First Name", "Nikit");
		jo.put("Last Name", "Patil");
		jo.put("Age", 27);
		
		
		Map m = new LinkedHashMap(4);
		
		m.put("Street", "Pan card Baner");
		m.put("City", "Pune");
		m.put("State", "Maharashtra");
		m.put("PostalCode",411045);
		
		jo.put("Address", m);
		
		
		JSONArray ja = new JSONArray();
		
		
		m= new LinkedHashMap(2);
		
		m.put("Type", "Home");
		m.put("Number", 2576016);
		
		ja.add(m);
		
		
		jo.put("PhoneNumbers", ja);
		
		
		
		
		PrintWriter pw = new PrintWriter("JsonEx.json");
	
		pw.write(jo.toString());
		pw.flush();
		pw.close();
		
		
		
		
		
	}

}
