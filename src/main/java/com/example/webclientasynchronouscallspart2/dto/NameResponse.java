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
  private int age;
  private String gender;
  private String country;

}
