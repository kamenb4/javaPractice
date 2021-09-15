public class Book {
    private final String name;
    private final String author;
    private final int count;
    private final int number;

    public Book(String name, String author, int count, int number) {
        this.name = name;
        this.author = author;
        this.count = count;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCount() {
        return count;
    }

    public int getNumber() {
        return number;
    }
}
