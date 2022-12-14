package advancedMay.advanced.iteratorsAndComparators.lab.library;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private final Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private class LibIterator implements Iterator<Book> {
        private int index;

        public LibIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < books.length;
        }

        @Override
        public Book next() {
            return books[index++];
        }
    }
}
