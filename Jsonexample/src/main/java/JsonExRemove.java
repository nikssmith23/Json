import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

public class JsonExRemove {
	@Test
	public void update() throws Exception {
		Object obj = new JSONParser().parse(new FileReader("JsonEx.json"));
		JSONObject jo = (JSONObject) obj;
		Set keys = jo.keySet();
		Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			if (key.equals("Age")) {
				System.out.println("REMOVING \n KEY:VALUE");
				System.out.println(key + ":" + jo.get(key).toString());
				iterator.remove();
				jo.remove(key);
			}
		}
		PrintWriter pw = new PrintWriter("JsonEx.json");
		pw.write(jo.toString());
		pw.flush();
		pw.close();
	}
}
