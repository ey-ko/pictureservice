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

import org.sp.pictureservice.model.Picture;
import org.sp.pictureservice.service.PictureService;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PictureResource {
	
	PictureService ps = new PictureService();

	@GET
	public List<Picture> getAllPictures(@PathParam("eventId") long eventId) {
			return ps.getAllPictures(eventId);
	}
	
	@GET
	@Path("/{pictureId}")
	public Picture getPictureById(@PathParam("eventId") long eventId, @PathParam("pictureId") long id) {
		return ps.getPicture(eventId, id);
	}

	@POST
	public Picture addPicture(@PathParam("eventId") long eventId, Picture picture){
		return ps.addPicture(eventId, picture);
	}
	
	@PUT
	@Path("/{pictureId}")
	public Picture updatePicture(@PathParam("eventId") long eventId, @PathParam("pictureId") long id, Picture picture){
		picture.setId(id);
		return ps.updatePicture(eventId, picture);
	}
	
	@DELETE
	@Path("/{pictureId}")
	public void deletePicture(@PathParam("eventId") long eventId, @PathParam("pictureId") long id){
		ps.removePicture(eventId,id);
	}
}
