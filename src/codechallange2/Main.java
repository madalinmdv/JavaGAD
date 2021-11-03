package codechallange2;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s="";
        var scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Comute str = new Comute();
        s = str.comute(number);
        System.out.println(s);
    }
}
