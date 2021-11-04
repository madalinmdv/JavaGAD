package lab1_codechallange2;
public class Comute {
    private int number;
    public String  comute(int number){
        String s="";
        boolean divisible=false;
        if (number % 3 == 0) {
            s = s + "Foo";
            divisible=true;
        }
        if (number % 5 == 0) {
            s = s + "Bar";
            divisible=true;
        }
        if (number % 7 == 0) {
            s = s + "Qix";
            divisible=true;
        }
        if (divisible==false){
            s= Integer.toString(number);
        }
        int[] digits = Integer.toString(number).chars().map(c -> c-'0').toArray();
        for( int i=0; i<digits.length;i++){
            if(digits[i]==3)
                s=s+ "Foo";
            else if(digits[i]==5)
                s=s+ "Bar";
            else if (digits[i]==7)
                s=s+ "Qix";
        }
        return s;
    }
    public String  comute2(int number){
        String s="";
        boolean divisible = false;
        if (number % 3 == 0)
            s = s + "Foo";


        if (number % 5 == 0)
            s = s + "Bar";

        if (number % 7 == 0)
            s = s + "Qix";
        int[] digits = Integer.toString(number).chars().map(c -> c-'0').toArray();
        for( int i=0; i<digits.length;i++){
            if(digits[i]==3)
                s=s+ "Foo";
            else if(digits[i]==5)
                s=s+ "Bar";
            else if (digits[i]==7)
                s=s+ "Qix";
            else if (digits[i]==0)
                s=s+ "*";
        }
        return s;
    }

    private void setNumber(int number){
        if ((number < 1)&&(number >1000000))
            throw new IllegalArgumentException("Interest");
        this.number = number;
    }
    private int getNumber(){
        return number;
    }
}
