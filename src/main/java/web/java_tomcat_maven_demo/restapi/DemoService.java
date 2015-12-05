package web.java_tomcat_maven_demo.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/demo")
public class DemoService {

	@GET
	@Path("/{param}")
	public Response getRequest(@PathParam("param") String arg) {
 
		String output = "Response : " + arg;
 
		return Response.status(200).entity(output).build();
	}
}
