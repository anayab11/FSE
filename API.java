package com.nayab.jason;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.*;
public class API {
	public API () throws IOException, InterruptedException { 
		var client = HttpClient.newHttpClient();
	
		 var request = HttpRequest.newBuilder(
                 URI.create("https://pokeapi.co/api/v2/generation/1/"))
         .header("accept", "application/json")
         .build();
	
		 var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		 System.out.println(response.body()); 
		 
				 
	
	
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		new API();
	}
	
	
	
}
