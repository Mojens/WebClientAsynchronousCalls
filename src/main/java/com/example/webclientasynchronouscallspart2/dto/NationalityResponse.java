package com.example.webclientasynchronouscallspart2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class NationalityResponse {

  private ArrayList<CountryResponse> country;
  private String name;
}
