package com.m2p.CrudDemo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "books")
public class Book {

    @Id
    @Column(name="bookID")
    private Long bookId;


    @Column(name="bookName")
    private  String bookName;


    @Column(name= "bookPrize")
    private int bookPrize;

   }