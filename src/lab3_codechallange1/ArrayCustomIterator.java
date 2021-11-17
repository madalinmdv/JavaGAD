package lab3_codechallange1;

public class ArrayCustomIterator{
    private int[] arr;

    public ArrayCustomIterator(int[] arr){
        this.arr = arr;
    }

    public boolean hasNext(){
        if(arr.length>0)
            return true;
        else
            return false;
    }

    public int next(){
        int [] arrcopy = new int[arr.length-1];
        int next = arr[0];
        for (int i=1; i<arr.length;i++){
            arrcopy[i-1]=arr[1];
        }
        arr = arrcopy;
        return next;
    }
    }


