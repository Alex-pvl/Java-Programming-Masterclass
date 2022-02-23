package ru.alexpvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Main {

    public static void main(String[] args) {
	    try {
            URL url = new URL("https://api.flickr.com/services/feeds/photos_public.gne?tags=cats");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-agent", "Google");

            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);
            connection.setReadTimeout(30000);

            if(responseCode != 200) {
                System.out.println("Error reading web page");
                System.out.println(connection.getResponseMessage());
                return;
            }

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }

            inputReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
