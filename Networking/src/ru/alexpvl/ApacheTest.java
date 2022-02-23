package ru.alexpvl;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApacheTest {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet("http://example.org");
        request.addHeader("User-agent", "Google");

        CloseableHttpResponse response = client.execute(request);

        System.out.println("Response: " + response.getCode());
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        String line;
        while ((line = inputReader.readLine()) != null) {
            System.out.println(line);
        }
        inputReader.close();
        response.close();

    }
}
