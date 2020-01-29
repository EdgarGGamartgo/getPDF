package guru.springfamework.msscbrewery.services;

import guru.springfamework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


/*
 * 		Created by Edgar Martínez
 * */


@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerId(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
