package com.example.webclientasynchronouscallspart2.service;

import com.example.webclientasynchronouscallspart2.dto.GenderResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class GenderService {

  private final String uri = System.getenv("genderAPI");

  public Mono<GenderResponse> getGenderResponse(String name) {
    WebClient client = WebClient.create();
    Mono<GenderResponse> gender = client.get()
        .uri(uri+name)
        .retrieve()
        .bodyToMono(GenderResponse.class);
    return gender;
  }

}
