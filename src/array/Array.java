package array;

public class Array<arr> {
    private int length;
    private int index=0;
    int [] arr;
    public Array(int length){
        this.length=length;
        arr =new int[length];
    }

    public void insertValue(int element) {
        if (index < length) {
            arr[index] = element;
            index++;
        }
        else{
            System.out.println("out of bound");
        }
    }
    
    public void deleteValue(){
        if(index>=0){
            arr[--index]=0;
        }
        else{
            System.out.println("invalid index");
        }
    }
    
    public void displayArray(){
        System.out.println("[");
        for (int i = 0; i < length; i++) {
            System.out.printf(String.valueOf(arr[i]));
        }
        System.out.println("]");
    }
}
