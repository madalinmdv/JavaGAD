package lab1_codechallange4;

public class codechallange4 {
    public static void remove(int[] array, int pos) {
        for (int i = pos; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
    }

    public  int pairOfThree(int[] array) {
       int n = array.length;
       int contor = 0;
       for(int i=0;i<n-2;i++){
           for(int j=i+1; j<n-1;j++){
               for(int k=j+1;k<n;k++)
                   if(array[i] + array[j] + array[k] == 0) {
                       contor = contor +1;
                       remove(array, k);
                       n = n - 1;
                       remove(array, j);
                       n = n - 1;
                       remove(array, i);
                       n = n - 1;
                       i=0;
                       j=0;
                       k=0;
                   }
           }
       }
    return contor;
    }

}
