package com.nayab.jason;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.*;
public class Main {
	public Main () throws IOException, InterruptedException { 
		var client = HttpClient.newHttpClient();
		
		 var request = HttpRequest.newBuilder(
                 URI.create("https://pokeapi.co/api/v2/pokemon/?limit=6&offset=0"))
         .header("accept", "application/json")
         .build();
		 
		 var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		 System.out.println(response.body()); 
		 NamedAPIResourceList p1 = new Gson().fromJson(response.body(), NamedAPIResourceList.class);
		//NamedAPIResourceList b1 = new Gson().fromJson(response.body(), NamedAPIResourceList.class);
		
		//b1.printBerryFlavors();
		//System.out.println(b1.getResults().get(1).getName());
		 System.out.println(p1.getResults().get(0).getName());
		 System.out.println(p1.getResults().get(1).getName());
	
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		new Main();
	}
	
	
	
}
