public class Book {
    private String author;
    private String title;
    static Book of(String author, String title){
        return new Book();
    }
}
