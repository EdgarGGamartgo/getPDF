package guru.springfamework.msscbrewery.services;

import guru.springfamework.msscbrewery.web.model.BeerDto;
import guru.springfamework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerId(UUID customerId);

}
