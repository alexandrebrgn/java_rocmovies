package com.ndduroc.rocmovies.controllers;

import com.ndduroc.rocmovies.entity.Borrow;
import com.ndduroc.rocmovies.entity.BorrowRequestDTO;
import com.ndduroc.rocmovies.entity.Customer;
import com.ndduroc.rocmovies.entity.Movie;
import com.ndduroc.rocmovies.repository.MovieRepository;
import com.ndduroc.rocmovies.service.CustomersService;
import com.ndduroc.rocmovies.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
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

    @PostMapping("/{customerId}/borrow")
    public Borrow createBorrow(@PathVariable Integer customerId, @RequestBody BorrowRequestDTO request) {
        return custServ.createBorrow(customerId, request.getMovieId());
    }
}
