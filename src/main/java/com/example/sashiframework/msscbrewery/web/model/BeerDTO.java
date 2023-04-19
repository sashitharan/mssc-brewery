package com.example.sashiframework.msscbrewery.web.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data //Data creates Getters and setters, equals and hashCode methods for us
@NoArgsConstructor
@AllArgsConstructor
@Builder //Implement Builder pattern for us
public class BeerDTO {

private UUID id;
private String beerName;
private String beetStyle;
private long upc;


}
