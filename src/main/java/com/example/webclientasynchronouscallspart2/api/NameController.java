package com.example.webclientasynchronouscallspart2.api;

import com.example.webclientasynchronouscallspart2.dto.AgeResponse;
import com.example.webclientasynchronouscallspart2.dto.GenderResponse;
import com.example.webclientasynchronouscallspart2.dto.NameResponse;
import com.example.webclientasynchronouscallspart2.dto.NationalityResponse;
import com.example.webclientasynchronouscallspart2.service.AgeService;
import com.example.webclientasynchronouscallspart2.service.GenderService;
import com.example.webclientasynchronouscallspart2.service.NationalityService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class NameController {
  private final AgeService ageService;
  private final GenderService genderService;
  private final NationalityService nationalityService;

  public NameController(AgeService ageService, GenderService genderService, NationalityService nationalityService) {
    this.ageService = ageService;
    this.genderService = genderService;
    this.nationalityService = nationalityService;
  }

  @RequestMapping("/info/{name}")
  public NameResponse getInfoName(@PathVariable("name") String name) {
    long start = System.currentTimeMillis();

    Mono<AgeResponse> ageResponse = this.ageService.getAgeResponse(name);
    Mono<GenderResponse> genderResponse = this.genderService.getGenderResponse(name);
    Mono<NationalityResponse> nationalityResponse = this.nationalityService.getNationality(name);

    var monoResponse = Mono.zip(ageResponse, genderResponse, nationalityResponse).map(t -> {
      NameResponse nameResponse = new NameResponse();

      nameResponse.setName(name);

      nameResponse.setAge(t.getT1().getAge());

      nameResponse.setGender(t.getT2().getGender());

      nameResponse.setCountry(t.getT3().getCountry().get(0).getCountry());

      long end = System.currentTimeMillis();

      System.out.println("Time spent NON-BLOCKING (ms): " + (end - start));

      return nameResponse;
    });

    return monoResponse.block();
  }


}
