package study.jpashopstart.domain;

import lombok.Getter;

import javax.persistence.Entity;

@Entity
@Getter
public class Book extends Item {

    private String author;
    private String isbn;

    public void CreateBook(String author, String isbn) {
        this.author = author;
        this.isbn = isbn;
    }
}
