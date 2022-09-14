package com.m2p.CrudDemo.mapper;

import com.m2p.CrudDemo.dto.BookDto;
import com.m2p.CrudDemo.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookMapper Instance = Mappers.getMapper(BookMapper.class);

    @Mapping(source = "book.bookId" , target = "bookId")
    BookDto booktoBookDto(Book book);
    List<BookDto> bookstoBookDtos(List<Book> book);


    @Mapping(source = "bookDto.bookId" , target = "bookId")
    Book dtoToBook(BookDto bookDto);
}

