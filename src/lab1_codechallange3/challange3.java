package lab1_codechallange3;

public class challange3 {

//
    public static int pairOfTwo(int[] numbers) {
        int contor = 0; //Contor pentru numarul de perechi valabile
        int n=numbers.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == 0) {
                    contor=contor+1;
                    for(int k=j;k<n-1;k++)
                        numbers[k]=numbers[k+1];
                    n=n-1;
                    for (int k=i;k<n-1;k++)
                        numbers[k]=numbers[k+1];
                    n=n-1;
                    i=0;
                    j=0;
                }
            }
        }
        return contor;
    }


}
