package guru.springfamework.msscbrewery.web.controller;


import guru.springfamework.msscbrewery.services.BeerService;
import guru.springfamework.msscbrewery.services.CustomerService;
import guru.springfamework.msscbrewery.web.model.BeerDto;
import guru.springfamework.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {

        return new ResponseEntity<>(customerService.getCustomerId(customerId), HttpStatus.OK);
    }

}
