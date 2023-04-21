package com.example.sashiframework.msscbrewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data //Data creates Getters and setters, equals and hashCode methods for us
@NoArgsConstructor
@AllArgsConstructor
@Builder //Implement Builder pattern for us
public class BeerDTOV2 {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;

}
