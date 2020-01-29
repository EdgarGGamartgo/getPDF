package guru.springfamework.msscbrewery.services;

import guru.springfamework.msscbrewery.web.model.BeerDto;

import java.util.UUID;


/*
 * 		Created by Edgar Martínez
 * */


public interface BeerService {

    BeerDto getBeerId(UUID beerId);
}
