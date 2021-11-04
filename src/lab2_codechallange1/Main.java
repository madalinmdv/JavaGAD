package lab2_codechallange1;

public class Main {
    public static void main(String[] args){
        Fighter f1 = new Fighter("Madalin",100,10);
        Fighter f2 = new Fighter("Andrei",100,10);
        BoxingMatch boxingMatch = new BoxingMatch(f1,f2);
        System.out.println("Winner:" + boxingMatch.fight());
    }
}