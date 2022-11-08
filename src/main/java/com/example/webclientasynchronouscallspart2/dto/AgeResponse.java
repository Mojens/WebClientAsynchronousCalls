package com.example.webclientasynchronouscallspart2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class AgeResponse {

  private int age;
  private int count;
  private String name;
}
