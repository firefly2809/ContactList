package ContactListService.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ContactList")
public class ContactListRestService {

    @Path("/getContact/{name}")
    @GET
    @Produces("application/json")
    public String getContact(@PathParam("name") String name) {
        //Описание метода по получению контакта
        return String.format("{\n%s: 12345678}", name);
    }

}
