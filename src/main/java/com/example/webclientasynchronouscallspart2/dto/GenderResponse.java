package com.example.webclientasynchronouscallspart2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class GenderResponse {

  private int count;
  private String gender;
  private String name;
  private double probability;

}
