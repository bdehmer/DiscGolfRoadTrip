package com.buck.discgolf.DGApp.services;

import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.UriSpec;
import org.springframework.web.reactive.function.client.WebClient.RequestBodySpec;

public class DGCR {
    private WebClient client;
    private String apiKey;

    //consider builder for this class
    public DGCR() {
        this.client = WebClient.create();
        this.apiKey = System.getenv("DGCR_API_KEY");
    }

    public String doSomething() {
        WebClient client =  WebClient.create();
        UriSpec<RequestBodySpec> uriSpec = client.method(HttpMethod.GET);
        RequestBodySpec bodySpec = uriSpec.uri(""); //waiting on DGCR and PDGA api access requests

        return "";
    }
}
