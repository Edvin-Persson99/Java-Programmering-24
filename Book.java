public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){

        this.title = title;
        this.author = author;
        this.year = year;

    }


    public String toString(){
        return "The author is "+author+" and the title is "+title+ " and the year is "+year;
    }

    public static void main(String[] args) {
        Book book = new Book("Something", "Someone", 1000);
        System.out.println(book);
    }

}
