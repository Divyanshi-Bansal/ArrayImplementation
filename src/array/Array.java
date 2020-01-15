package array;

public class Array{
    public int[] arr;
    public int s = 0;
    private int length;
    private int index = 0;


    public Array(int length) {
        this.length = length;
        arr = new int[length];
    }

    public void insertValue(int element, int index) {
        if (index < length) {
            arr[index] = element;
        } else {
            System.out.println("out of bound");
        }
    }

    public void deleteValue(int index) {
        if (index >= 0) {
            arr[index] = 0;
        } else {
            System.out.println("invalid index");
        }
    }

    public void displayArray() {
        System.out.printf("[");
        for (int i = 0; i < length; i++) {
            System.out.printf(String.valueOf(arr[i] ));
            System.out.printf(" ");

        }
        System.out.println("]");
    }

    public void bubbleSort() {
        for (int j = 0; j < arr.length - j; j++) {//function of bubble sort
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swapArrayValues(i, i + 1, arr);
                }
            }
        }
//        int k =Arrays.sort(arr);//utilise method
//        System.out.println(k);

    }

    public void swapArrayValues(int i, int i1, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }


    //public void sortArray(){
    //Arrays.sort(arr);
    //System.out.println("modified arr[] : %s", Arrays.toString(arr));
    //}

    public void sumArray() {
        for (int i = 0; i < length; i++) {
            s = s + arr[i];
        }
        System.out.println(s);
    }
}
