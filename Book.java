public class Book {

    private String title;
    private String author;
    private int year;

    public Book(){

       

    }


    public String toString(){
        return "The author is "+author+" and the title is "+title+ " and the year is "+year;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.author = "Leif Gw persson";
        book1.title = "Den som dödar draken";
        book1.year  = 2008;
    }

}
