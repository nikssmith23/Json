package com.nik;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class JsonExRead {
	@Test
	public void read() throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("JsonEx.json"));

		JSONObject jo = (JSONObject) obj;

		// getting firstName and lastName
		String firstName = (String) jo.get("First Name");
		String lastName = (String) jo.get("Last Name");

		System.out.println(firstName);
		System.out.println(lastName);

		// getting age
		Long age = (Long) jo.get("Age");
		System.out.println(age);

		// getting address
		Map address = ((Map) jo.get("Address"));

		// iterating address Map
		Iterator<Map.Entry> itr1 = address.entrySet().iterator();
		while (itr1.hasNext()) {
			Map.Entry pair = itr1.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}

		// getting phoneNumbers
		JSONArray ja = (JSONArray) jo.get("PhoneNumbers");

		// iterating phoneNumbers
		Iterator itr2 = ja.iterator();

		while (itr2.hasNext()) {
			itr1 = ((Map) itr2.next()).entrySet().iterator();
			while (itr1.hasNext()) {
				Map.Entry pair = itr1.next();
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}

		}

	}
}
