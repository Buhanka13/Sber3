public class Main {
    public static void main(String[] args) {
        Author author = new Author("Имя Фамилия", "Пол", "pochta@example.com");
        Book book = new Book("Книга", author, 2022);
        System.out.println(book.toString());
    }
}