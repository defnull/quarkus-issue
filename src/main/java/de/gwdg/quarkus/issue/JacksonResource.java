package de.gwdg.quarkus.issue;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

@Path("/test")
@ApplicationScoped
public class JacksonResource {

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String test(
			@FormParam("foo") String foo,
			MultivaluedMap<String, String> form) {
		return "foo=" + foo + " form=" + form.toString();
	}

}
