package com.example.webclientasynchronouscallspart2.dto;

import lombok.*;

import java.util.Locale;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class CountryResponse {

  private String country_id;
  private double probability;

}
