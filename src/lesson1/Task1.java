package lesson1;

import java.util.ArrayList;

public class Task1<T> {
    private T [] arr;


    public Task1(T... arr) {
        this.arr = arr;

    }


    public T[] changeArr (int one, int two) {
        Object index1 = arr[one];
        Object index2 = arr[two];
        arr[one] = (T) index2;
        arr[two] = (T) index1;
        return arr;
    }

    public ArrayList creatArrList() {

        ArrayList newArr = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
                newArr.add(arr[i]);
        }
        return newArr;
    }
}
