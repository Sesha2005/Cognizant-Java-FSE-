package org.example;
public class LibraryApplication {

    public static void main(String[] args) {

        LibraryManager manager = new LibraryManager();
        LibraryStorage storage = new LibraryStorage();

        manager.manageLibrary();
        storage.displayStorage();
    }
}
