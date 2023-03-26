package com.mehmetnuri.springwebmvcornek.convterter;

import com.mehmetnuri.springwebmvcornek.entity.Book;
import com.mehmetnuri.springwebmvcornek.payload.request.BookSaveRequestDto;
import com.mehmetnuri.springwebmvcornek.payload.response.BookResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookConverter {


    public Book saveRequestToBook(BookSaveRequestDto bookSaveRequestDto) {
        Book book = new Book();
        book.setTitle(bookSaveRequestDto.getTitle());
        book.setShortDescription(bookSaveRequestDto.getShortDescription());
        book.setLongDescription(bookSaveRequestDto.getLongDescription());
        return book;
    }

    public BookResponseDto bookToBookResponseDto(Book book) {
        BookResponseDto dto = new BookResponseDto();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setShortDescription(book.getShortDescription());
        dto.setLongDescription(book.getLongDescription());
        return dto;
    }

    public List<BookResponseDto> bookListToBookResponseDtoList(List<Book> bookList) {
        List<BookResponseDto> dtoList = new ArrayList<>();

        if (bookList.size()>0) {
            for (Book book : bookList) {
                BookResponseDto dto = new BookResponseDto();
                dto.setId(book.getId());
                dto.setTitle(book.getTitle());
                dto.setShortDescription(book.getShortDescription());
                dto.setLongDescription(book.getLongDescription());
                dtoList.add(dto);
            }
        }

        return dtoList;
    }

}
