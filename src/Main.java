public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Иван","Сергеевич","Тургенев");
        Author author2 = new Author("Михаил","Афанасьевич","Булгаков");

        Book book1 = new Book("Отцы и дети", 1862, author1);
        Book book2 = new Book("Мастер и Маргарита", 1937, author2);

        book1.setYear(1872);
        System.out.println(book1);
        System.out.println(book2);
    }
}