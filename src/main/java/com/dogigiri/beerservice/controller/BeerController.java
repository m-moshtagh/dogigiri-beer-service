package com.dogigiri.beerservice.controller;

import com.dogigiri.beerservice.model.entity.Beer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
    @GetMapping("/{beerId}")
    public ResponseEntity<Beer> getBeer(@PathVariable("beerId") UUID beerId) {
        // not implemented yet!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Beer> saveBeer(@RequestBody Beer beer) {
        // not implemented yet!
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Beer> updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody Beer beer) {
        // not implemented yet!
        return new ResponseEntity<Beer>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId) {
        // not implemented yet!
    }
}
