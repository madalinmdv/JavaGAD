package lab3_visitor;

public class Video implements Element {
    private String name;
    private String type;
    private int price;
    private int time;

    public Video(String name, int price, int time) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.time = time;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    public String toString(){
        return name + ",price" + price + ",time" + type;
    }

}
