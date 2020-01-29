package guru.springfamework.msscbrewery.services;

import guru.springfamework.msscbrewery.web.model.BeerDto;
import guru.springfamework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerId(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("Edgar")
                .build();
    }
}
