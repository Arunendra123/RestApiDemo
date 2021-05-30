package com.learning.RestApiDemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

@Path("results")
@XmlRootElement
public class Results {
	 String data;
	 public Results() {
	
	 }
	
	 @GET
     @Path("gettables/{number}")
     @Produces(MediaType.APPLICATION_XML)
     public String getTable(@PathParam("number") int number) {
		System.out.println("Number:"+number);
		Tables t=new Tables();
        return t.getTable(number);
     }
	 
	 @GET
     @Path("gettablestill/{number}")
     @Produces(MediaType.APPLICATION_XML)
     public String getTableTill(@PathParam("number") int number) {
		System.out.println("Number:"+number);
		Tables t=new Tables();
        return t.getTableTill(number);
     }
}
