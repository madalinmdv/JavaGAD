package lab1_codechallange4;

public class Main {
    public static void main(String[] args){
        int[] intArray = {-1, -1, -1, 2, 4, -2, -2};
        int c=0;

        codechallange4 x = new codechallange4();
        c = x.pairOfThree(intArray);
        System.out.println("Numarul de perechi este "+c);
    }
}
