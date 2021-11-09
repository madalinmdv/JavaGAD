package lab2_codechallange3;

public class Cat extends Animal implements Pet {
    public String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    protected  Cat(String name){
        super(4);
        this.name=name;
    }
    public Cat() {
        this("");
    }


    @Override
    public void eat() {
        System.out.println("The cat is eating.");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing.");
    }
}
