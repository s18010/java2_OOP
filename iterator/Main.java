class Main {
    public static void main(String [] args) {
            BookShelf bookShelf = new BookShelf(4);
            bookShelf.appendBook(new Book("80日間世界一周"));
            bookShelf.appendBook(new Book("聖書"));
            bookShelf.appendBook(new Book("シンデレラ"));
            bookShelf.appendBook(new Book("あしながおじさん"));
            bookShelf.appendBook(new Book("あしながおじさん"));
            Iterator it = bookShelf.iterator();
            while(it.hasNext()) {
                        Book book = (Book)it.next();
                        System.out.println(book.getName());
                    }
        }
}
