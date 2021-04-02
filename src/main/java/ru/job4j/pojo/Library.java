package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 460);
        Book book2 = new Book("Head First Java", 708);
        Book book3 = new Book("Java: The Complete Reference", 1500);
        Book book4 = new Book("Core Java SE 9 for the Impatient", 576);
        Book[] books = new Book[] {book1, book2, book3, book4};
        for (Book book : books) {
            System.out.println(book.getName() + "-" + book.getPageCount());
        }
            Book temp = books[0];
            books[0] = books[3];
            books[3] = temp;
        for (Book book : books) {
            System.out.println(book.getName() + "-" + book.getPageCount());
        }
        for (Book book : books) {
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName() + "-" + book.getPageCount());
            }
        }
    }
}
