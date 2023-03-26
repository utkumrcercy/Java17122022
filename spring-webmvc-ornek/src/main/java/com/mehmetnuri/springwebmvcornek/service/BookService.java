package com.mehmetnuri.springwebmvcornek.service;

import com.mehmetnuri.springwebmvcornek.convterter.BookConverter;
import com.mehmetnuri.springwebmvcornek.entity.Book;
import com.mehmetnuri.springwebmvcornek.payload.request.BookSaveRequestDto;
import com.mehmetnuri.springwebmvcornek.payload.request.BookUpdateRequestDto;
import com.mehmetnuri.springwebmvcornek.payload.response.BookResponseDto;
import com.mehmetnuri.springwebmvcornek.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository repository;
    private final BookConverter bookConverter;

    public BookService(BookRepository repository, BookConverter bookConverter) {
        this.repository = repository;
        this.bookConverter = bookConverter;
    }

    /**
     * CRUD (Create, Read, Update, Delete) Operations
     */

    // Create
    public BookResponseDto createBook(BookSaveRequestDto dto) {
        Book book = this.bookConverter.saveRequestToBook(dto);
        Book save = this.repository.save(book);
        return this.bookConverter.bookToBookResponseDto(save);
    }

    // Read
    public BookResponseDto getBookById(Long id) {
        Optional<Book> byId = this.repository.findById(id);
        if (byId.isPresent()) {
            return this.bookConverter.bookToBookResponseDto(byId.get());
        } else {
            return null;
        }
    }

    // Update
    public BookResponseDto updateBook(BookUpdateRequestDto dto) {
        if (dto.getId() == null) {
            return null;
        }
        Optional<Book> byId = this.repository.findById(dto.getId());

        if (byId.isEmpty()) {
            return null;
        }

        Book book = byId.get();
        book.setTitle(dto.getTitle());
        book.setShortDescription(dto.getShortDescription());
        book.setLongDescription(dto.getLongDescription());
        Book save = this.repository.save(book);
        return this.bookConverter.bookToBookResponseDto(save);
    }

    //Find All
    public List<BookResponseDto> getAllBooks() {
        List<Book> bookList = this.repository.findAll();
        return this.bookConverter.bookListToBookResponseDtoList(bookList);
    }

    //Delete
    public void deleteBook(Long id) {
        this.repository.deleteById(id);
    }

}
