package lab3_visitor;

public interface Visitor {
    void visit(Book book);
    void visit(Video video);
    void visit (Audio audio);
}
