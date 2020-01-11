package array;

public class Array {
    private int length;
    private int index=0;
    int [] arr;
    public Array(int length){
        this.length=length;
        arr =new int[length];
    }

    public void insert(int element){
        arr[index] = element;
        index++;
    }

}
