import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class JsonExUpdate {
	@SuppressWarnings("unchecked")
	@Test
	public void update() throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("JsonEx.json"));

		JSONObject jo = (JSONObject) obj;
		String firstName = (String) jo.get("First Name");
		String newName="Paritosh";
		if (firstName.equals("Rahul"))
		{

			jo.put("First Name",newName);
			jo.remove("First Name", "Paritosh");
		}
		PrintWriter pw = new PrintWriter("JsonEx.json");
		pw.write(jo.toString());
		pw.flush();
		pw.close();

	}

}
