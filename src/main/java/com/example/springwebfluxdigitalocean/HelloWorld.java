//package com.example.springwebfluxdigitalocean;
//
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.client.ClientResponse;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//
//public class HelloWorld {
//    public static void main(String[] args) {
//        WebClient webClient= WebClient.create("https://localhost:8080");
//        Mono<ClientResponse> clientResponseMono=webClient
//                .get()
//                .uri("/helloapi")
//                .accept(MediaType.APPLICATION_JSON)
//                .exchange();
//        System.out.println("clientResponseMono.flatMap(clientResponse -> {}) = " + clientResponseMono
//                .flatMap(clientResponse -> clientResponse.bodyToMono(String.class)).block());
//    }
//}
