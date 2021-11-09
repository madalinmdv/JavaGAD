package lab2_codechallange3;

public class Main {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Tigrone");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println(c.getName());
        Animal[] animals = {new Cat("Tabi"), new Fish("Dani"), new Spider("Yuck")};

    }
}
