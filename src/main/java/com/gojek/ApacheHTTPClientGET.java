package com.gojek;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApacheHTTPClientGET implements HTTPClientGET {

    public StringBuilder HTTPresponse;

    @Override
    public StringBuilder fireGETRequest(String inputURL) throws IOException {

        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {

            var request = new HttpGet(inputURL);
            HttpResponse response = httpClient.execute(request);

            var buffReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String lineReader;

            while ((lineReader = buffReader.readLine()) !=null) {
                this.HTTPresponse.append(lineReader);
                this.HTTPresponse.append(System.lineSeparator());
            }

        } catch (IOException e) {
            System.out.println("HTTP Request unsuccessful");
        }

        return HTTPresponse;
    }

    @Override
    public String returnContentType() {

        return "application/json";
    }

    @Override
    public Integer returnHTTPStatus() {

        return 200;
    }
}
