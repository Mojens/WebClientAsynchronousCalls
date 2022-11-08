package com.example.webclientasynchronouscallspart2.service;

import com.example.webclientasynchronouscallspart2.dto.AgeResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class AgeService {

  public Mono<AgeResponse> getAgeResponse(String name) {
    return WebClient.create()
        .get()
        .uri("https://api.agify.io?name=" + name)
        .retrieve()
        .bodyToMono(AgeResponse.class);
  }

}
