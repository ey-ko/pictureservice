package org.sp.pictureservice.database;

import java.util.HashMap;
import java.util.Map;

import org.sp.pictureservice.model.Event;
import org.sp.pictureservice.model.Picture;

public class DatabaseClass {

	public static Map<Long, Event> events = new HashMap<>();
	public static Map<Long, Picture> pictures = new HashMap<>();
	
	
	public static Map<Long, Event> getEvents(){
		return events;
	}
	
	public static Map<Long, Picture> getPictures(){
		return pictures;
	}
	
}
