package com.m2p.CrudDemo.controller;

import com.m2p.CrudDemo.dto.BookDto;
import com.m2p.CrudDemo.entity.Book;
import com.m2p.CrudDemo.mapper.BookMapper;
import com.m2p.CrudDemo.service.BookServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    private BookServiceIn bookServiceIn;

    @Autowired
    private BookMapper bookMapper;


    @PostMapping("/createbook")
    public ResponseEntity<Book> savebook(@RequestBody BookDto bookDto)
    {
        return new ResponseEntity<Book>(bookServiceIn.saveBook(bookMapper.dtoToBook(bookDto)), HttpStatus.CREATED);
    }


    @GetMapping("/getAllBooks")
    public  ResponseEntity<List<BookDto>> getAllBooks(){
        return new ResponseEntity<List<BookDto>>(bookMapper.bookstoBookDtos(bookServiceIn.getAllBooks()), HttpStatus.OK);
    }

    @GetMapping("/getBookById/{bookId}")
    public ResponseEntity<BookDto> getBookById(@PathVariable("bookId") long bookId){
        return  new ResponseEntity<BookDto>(bookMapper.booktoBookDto(bookServiceIn.getBookById(bookId)), HttpStatus.OK);
    }

    @PutMapping("/updateBook/{bookId}")
    public ResponseEntity<Book> updateBook(@RequestBody BookDto bookDto,@PathVariable("bookId") long bookId){
        return  new ResponseEntity<Book>(bookServiceIn.updateBook(bookMapper.dtoToBook(bookDto),bookId), HttpStatus.OK);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable("bookId") long bookId){
        bookMapper.booktoBookDto(bookServiceIn.deleteBook(bookId));
        return new ResponseEntity<String>("book deleted",HttpStatus.OK);
    }




}

