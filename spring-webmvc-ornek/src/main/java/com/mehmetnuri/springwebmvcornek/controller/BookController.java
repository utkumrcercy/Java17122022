package com.mehmetnuri.springwebmvcornek.controller;

import com.mehmetnuri.springwebmvcornek.payload.request.BookSaveRequestDto;
import com.mehmetnuri.springwebmvcornek.payload.request.BookUpdateRequestDto;
import com.mehmetnuri.springwebmvcornek.payload.response.BookResponseDto;
import com.mehmetnuri.springwebmvcornek.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path = "/")
    public String index() {
        return "redirect:/books";
    }

    //Find All Books
    @GetMapping(path = "/books")
    public String findAllBooks(Model model) {
        List<BookResponseDto> allBooks = this.bookService.getAllBooks();

        model.addAttribute("books", allBooks);
        return "book";
    }

    @PostMapping(path = "/books/save")
    public String saveBook(@ModelAttribute BookSaveRequestDto bookForm, BindingResult result, Model model) {

        this.bookService.createBook(bookForm);
        return "redirect:/books";
    }

    @GetMapping(path = "/books/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        this.bookService.deleteBook(id);
        return "redirect:/books";
    }

    @GetMapping(path = "/books/edit/{id}")
    public String saveBook(Model model, @PathVariable("id") Long id) {
        BookResponseDto bookById = this.bookService.getBookById(id);
        model.addAttribute("book", bookById);
        return "bookedit";
    }

    @PostMapping(path = "/books/update/{id}")
    public String updateBook(@ModelAttribute BookUpdateRequestDto bookForm, @PathVariable("id") Long id) {
        this.bookService.updateBook(bookForm);
        return "redirect:/books";
    }
}
