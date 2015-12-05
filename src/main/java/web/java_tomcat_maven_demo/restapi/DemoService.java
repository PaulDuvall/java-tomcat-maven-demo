package web.java_tomcat_maven_demo.restapi;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/demo")
public class DemoService {

	@GET
	@Path("/{param}")
	public Response getRequest(@PathParam("param") String arg) {
		String output = "Get Response : " + arg;
		return Response.status(200).entity(output).build();
	}
	
	@POST
	@Path("/{param}")
	public Response postRequest(@PathParam("param") String arg) {
		String output = "Post Response : " + arg;
		return Response.status(200).entity(output).build();
	}
	
	@DELETE
	@Path("/{param}")
	public Response deleteRequest(@PathParam("param") String arg) {
		String output = "Delete Response : " + arg;
		return Response.status(200).entity(output).build();
	}
	
	@PUT
	@Path("/{param}")
	public Response putRequest(@PathParam("param") String arg) {
		String output = "Put Response : " + arg;
		return Response.status(200).entity(output).build();
	}
	
	@HEAD
	@Path("/{param}")
	public Response headRequest(@PathParam("param") String arg) {
		String output = "Head Response : " + arg;
		return Response.status(200).entity(output).build();
	}
}
