package lab2_codechallange3;

public class Spider extends Animal {
    public String name;

    protected Spider(String name) {
        super(8);
        this.name = name;
    }

    public Spider(){
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spyder is eating.");
    }
}
