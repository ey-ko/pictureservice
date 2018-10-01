package org.sp.pictureservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.sp.pictureservice.database.DatabaseClass;
import org.sp.pictureservice.model.Event;
import org.sp.pictureservice.model.Picture;

public class EventService {

	public static Map<Long, Event> events = DatabaseClass.getEvents();
	
	public EventService(){
		events.put(1L, new Event(1, "Party1", new Date(System.currentTimeMillis())));
		events.put(2L, new Event(2, "Party2", new Date(System.currentTimeMillis())));	

	}

	
	public List<Event> getAllEvents(){
		return new ArrayList<Event>(events.values());
		
	}
	
	public Event getEventById(long id){
		return events.get(id);
	}
	
	public Event addEvent(Event event){
		event.setId(events.size() + 1);
		events.put(event.getId(), event);
		return event;
	}
	
	public Event updateEvent(Event event){
		if (event.getId() <= 0) {
			return null;
		}
		events.put(event.getId(), event);
		return event;
	}

	public Event removeEvent(long id){
		return events.remove(id);
	}
}
