package com.example.sashiframework.msscbrewery.web.controller;


import com.example.sashiframework.msscbrewery.services.BeerService;
import com.example.sashiframework.msscbrewery.web.model.BeerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @Autowired
    public BeerService beerService;


    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(BeerDTO beerDTO){
        BeerDTO saveDTO = beerService.saveNewBeer(beerDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/v1/beer"+saveDTO.getId().toString());
        return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }

}



