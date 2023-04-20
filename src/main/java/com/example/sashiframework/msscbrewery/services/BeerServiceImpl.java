package com.example.sashiframework.msscbrewery.services;

import com.example.sashiframework.msscbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                .id(beerId)
                .beerName("Galaxy Cat")
                .beerStyle("Pale")
                .build();
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beerDTO) {
        return BeerDTO
                .builder()
                .id(UUID.randomUUID())
                .build();
    }
}
