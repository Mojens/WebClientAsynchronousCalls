package com.example.webclientasynchronouscallspart2.service;

import com.example.webclientasynchronouscallspart2.dto.NationalityResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class NationalityService {

  private final String uri = System.getenv("nationalAPI");

  public Mono<NationalityResponse> getNationality(String name){
    return WebClient.create()
        .get()
        .uri(uri+name)
        .retrieve()
        .bodyToMono(NationalityResponse.class);
  }

}
