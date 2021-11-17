package lab3_visitor;

public class Book implements Element{
    private String name;
    private int numberOfPages;
    private int price;
    private int author;

    public Book(String name, int numberOfPages, int price) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}
