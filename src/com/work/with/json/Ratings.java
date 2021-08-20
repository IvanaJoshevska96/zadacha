package com.work.with.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Ratings {

	public static void main(String[] args) throws IOException, ParseException {
		//ArrayList to store ratings and then sort it
		  FileReader read = new FileReader(
			        "C:\\Users\\User\\eclipse-workspace\\Task\\files\\reviews.json");
			    JSONParser parser = new JSONParser();
			    Object obj = parser.parse(read);
			    JSONObject jsonObject = new JSONObject();
			    jsonObject = (JSONObject) obj;

			    JSONArray reviews = new JSONArray();
			    reviews = (JSONArray) jsonObject.get("reviews");

			    Iterator<Entry> itr1 = reviews.iterator();
			    while (itr1.hasNext()) {

			    	//There should be an iterator that will be iterate through "reviews" and find "rating" key
			      Iterator<Entry> itr2 = ((JSONObject) itr1.next()).entrySet().iterator();
			      while (itr2.hasNext()) {
			        Map.Entry pair = itr2.next();
			        System.out.println(pair.getKey() + " " + pair.getValue());
			      }
			    }

	}

}
