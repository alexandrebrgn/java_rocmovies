package com.ndduroc.rocmovies.repository;
import com.ndduroc.rocmovies.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepository extends JpaRepository<Borrow, Integer> {
}
