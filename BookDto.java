package com.m2p.CrudDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private long bookId;
    private String bookName;
    private int bookPrize;
}
