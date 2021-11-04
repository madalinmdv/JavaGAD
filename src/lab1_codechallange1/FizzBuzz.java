package lab1_codechallange1;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        setNumber(number);
    }
    private void setNumber(int number){
        if ((number < 1)&&(number >100))
            throw new IllegalArgumentException("Interest");
        this.number = number;
    }
    public void codeChallange1(int number) {
        for(int i=1; i<=number;i++){
            if((i%3 == 0)&&(i%5 == 0))
                System.out.print("FizzBuzz ");
            else if (i%3==0)
                System.out.print("Fizz ");
            else if (i%5==0)
                System.out.print("Buzz ");
            else if (i%7==0)
                System.out.print("Rizz ");
            else if (i%11==0)
                System.out.print("Jazz ");
            else System.out.print(i + " ");
        }
    }
    private int getNumber(){
        return number;
    }
}
