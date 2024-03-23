package guru.springframework.spring6reactive.services;

import guru.springframework.spring6reactive.model.CustomerDTO;
import guru.springframework.spring6reactive.model.CustomerDTO;
import reactor.core.CorePublisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface CustomerService {
    Flux<CustomerDTO> listCustomers();

    Mono<CustomerDTO> getCustomerById(Integer beerId);

    Mono<CustomerDTO> saveNewCustomer(CustomerDTO beerDTO);

    Mono<CustomerDTO> updateCustomer(Integer beerId, CustomerDTO beerDTO);

    Mono<CustomerDTO> patchCustomer(Integer beerId, CustomerDTO beerDTO);

    Mono<Void> deleteCustomerById(Integer beerId);
}
