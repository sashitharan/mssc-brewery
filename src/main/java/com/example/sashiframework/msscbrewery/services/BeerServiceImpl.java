package com.example.sashiframework.msscbrewery.services;

import com.example.sashiframework.msscbrewery.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {
        System.out.println(beerId);
// todo implement- add a real time update
    }

    @Override
    public void deleteById(UUID beerId) {

        log.debug("Deleting a beer...");
    }
}
