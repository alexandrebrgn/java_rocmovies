package com.ndduroc.rocmovies.service;

import com.ndduroc.rocmovies.entity.Borrow;
import com.ndduroc.rocmovies.entity.Customer;
import com.ndduroc.rocmovies.entity.Movie;
import com.ndduroc.rocmovies.repository.CustomerRepository;
import com.ndduroc.rocmovies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Primary
@Service
public class CustomersService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private JpaRepository<Borrow, Integer> borrowRepository;

    public List<Customer> getListCustomers() {
        System.out.println("CustomerService - getListMovie()");
        return customerRepository.findAll();
    }

    public Borrow createBorrow(Integer customerId, Integer movieId) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        Movie movie = movieRepository.findById(movieId)
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        Borrow borrow = new Borrow(new Date(), customer.getId(), movie.getIdMovie(), "ACTIVE");
        return borrowRepository.save(borrow);
    }
}
