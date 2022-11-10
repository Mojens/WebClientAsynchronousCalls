package com.example.webclientasynchronouscallspart2.dto;

import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class CountryResponse {

  private String country_id;
  private double probability;

}
