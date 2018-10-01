package org.sp.pictureservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sp.pictureservice.model.Event;
import org.sp.pictureservice.service.EventService;

@Path("/events")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EventResource {
	
	EventService es = new EventService();
	
	@GET
	public List<Event> getAllEvents(){
		return es.getAllEvents();
	}
	
	@POST
	public Event addEvent(Event event){
		return es.addEvent(event);
	}
	
	@GET
	@Path("/{eventId}")
	public Event getEventById(@PathParam("eventId") long id) {
		return es.getEventById(id);
	}
	
	@PUT
	@Path("/{eventId}")
	public Event updateEvent(@PathParam("eventId") long id, Event event){
		event.setId(id);
		return es.updateEvent(event);
	}
	
	@DELETE
	@Path("/{eventId}")
	public void deleteEvent(@PathParam("eventId") long id){
		es.removeEvent(id);
	}
	
	@Path("/{eventId}/pictures")
	public PictureResource getPictureResource(){
		return new PictureResource();
	}
	

}
