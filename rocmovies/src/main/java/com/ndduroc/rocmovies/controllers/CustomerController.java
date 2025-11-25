package com.ndduroc.rocmovies.controllers;

import com.ndduroc.rocmovies.entity.Borrow;
import com.ndduroc.rocmovies.entity.BorrowRequestDTO;
import com.ndduroc.rocmovies.entity.Customer;
import com.ndduroc.rocmovies.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomersService custServ;

    @GetMapping("")
    public List<Customer> GetAllMovies() {
        System.out.println("CustomerController");
        return custServ.getListCustomers();
    }

    @GetMapping("/{customerId}/borrows")
    public List<Borrow> getBorrowsOfCustomer(@PathVariable Integer customerId) {
        return custServ.getBorrowOfCustomer(customerId);
    }

    @PostMapping("/{customerId}/borrow")
    public Borrow createBorrow(@PathVariable Integer customerId, @RequestBody BorrowRequestDTO request) {
        return custServ.createBorrow(customerId, request.getMovieId());
    }
}
