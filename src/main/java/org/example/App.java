package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        try {

            HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://brasilapi.com.br/api/ddd/v1/{ddd}")).GET()
                    .version(HttpClient.Version.HTTP_2)
                    .build();

    HttpClient client = HttpClient.newBuilder().build();

 HttpResponse<String> send =  client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(send.statusCode());
            System.out.println(send.body());
        }
        catch (URISyntaxException | IOException | InterruptedException e) {
            System.out.println("URL INVALIDA");
        }
    }
}
