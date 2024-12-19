package org.example;

/**
 * Represents a book with a title, author, and year of publication.
 */
public record Book(String title, String author, int yearPublished) {
    // The record automatically generates the constructor and other methods.
}
