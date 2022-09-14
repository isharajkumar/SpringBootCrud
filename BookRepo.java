package com.m2p.CrudDemo.repo;

import com.m2p.CrudDemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {



}

