package lab1_codechallange3;

public class Main {

    public static void main(String[] args){
        int[] array = {1,1,0,-1,-1};
        int pairs = 0;
        challange3 x = new challange3();
        pairs = x.pairOfTwo(array);
        System.out.print("Numarul de perechi din sirul introdus este: "+ pairs);
    }
}
