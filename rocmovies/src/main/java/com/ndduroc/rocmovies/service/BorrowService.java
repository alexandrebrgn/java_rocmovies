package com.ndduroc.rocmovies.service;

import com.ndduroc.rocmovies.entity.Borrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Primary
@Service
public class BorrowService {
    @Autowired
    private JpaRepository<Borrow, Integer> borrowRep;
}
