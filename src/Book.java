import java.util.Objects;

public class Book {
    private String name;
    private int year;
    private Author author;

    public Book(String name , int year , Author author) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public Author getAuthor(){
        return author;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && author.equals(book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, year, author);
    }

    @Override
    public String toString() {
        return name + " - " + year + " - " + author.toString();
    }
}
