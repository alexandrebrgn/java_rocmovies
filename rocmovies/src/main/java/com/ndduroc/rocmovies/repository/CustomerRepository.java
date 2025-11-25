package com.ndduroc.rocmovies.repository;
import com.ndduroc.rocmovies.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
