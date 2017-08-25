package Rest2;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("home")
public class Resource {
    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello, world!";
    }

    @POST
    @Path("post")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public String postMethod(@FormParam("name") String name) {
        return "<h2>Hello, " + name + "</h2>";
    }



    @POST
    @Path("plus")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_HTML)
    public String plusMethod(@FormParam("varA") int a,@FormParam("varB") int b) {
        int c = a+b;
        String ans = Integer.toString(c);
        return "<h2>Answer is " + ans + "</h2>";
    }

}