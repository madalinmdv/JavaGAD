package lab3_visitor;

public class TimeVisitor implements Visitor{
    private int time;
    public void visit(Book book){
        time += book.getNumberOfPages();
    }
    public void visit(Video video){
        time += video.getTime();
    }
    public void visit(Audio audio){
        time += audio.getTime();
    }

    @Override
    public String toString() {
        return "TimeVisitor{" +
                "time=" + time +
                '}';
    }
}
