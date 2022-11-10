package com.example.webclientasynchronouscallspart2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class NameResponse {

  private String name;
  private String gender;
  private double genderProbability;
  private int age;
  private int ageCount;
  private String country;
  private double countryProbability;

  public void setCountryProbability(double countryProbability) {
    this.countryProbability = countryProbability * 100;
  }

  public void setGenderProbability(double genderProbability) {
    this.genderProbability = genderProbability * 100;
  }
}
