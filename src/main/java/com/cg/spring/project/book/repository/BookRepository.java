package com.cg.spring.project.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.project.book.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,String> {
}
