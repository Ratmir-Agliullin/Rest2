package Rest2;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("calc")
public class Calculator {
//ICalc mcalc;
//
//    public Calculator(ICalc mcalc) {
//        this.mcalc = mcalc;
//    }

    @GET
    @Path("{opt}/{varA}/{varB}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAnswer(@PathParam(value="opt") String opt, @PathParam(value="varA") int varA, @PathParam(value="varB") int varB) {
        String res=null;
        if(opt.equals("plus"))
            res = "Answer: " + plus(varA,varB);
        else
            res = "Answer: "  + minus(varA,varB);
        return Response.status(201).entity(res).build();
    }

    private int plus(int a,int b){
        return a+b;
    }

    private int minus(int a,int b){
        return a-b;
    }
}
