package com.example.webclientasynchronouscallspart2.service;

import com.example.webclientasynchronouscallspart2.dto.GenderResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class GenderService {

  public Mono<GenderResponse> getGenderResponse(String name) {
    WebClient client = WebClient.create();
    Mono<GenderResponse> gender = client.get()
        .uri("https://api.genderize.io?name="+name)
        .retrieve()
        .bodyToMono(GenderResponse.class);
    return gender;
  }

}
