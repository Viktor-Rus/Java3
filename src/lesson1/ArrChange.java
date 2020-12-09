package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrChange {

    public static void main(String[] args) {
        Task1<Integer> arrInt = new Task1<>(1,2,3,4,5,6,7,8,9);
        Task1<String> arrStr = new Task1<>("раз", "два", "три","четыре","пять","шесть","семь","восемь");
        String [] arrStrChange = arrStr.changeArr(2, 7);
        System.out.println(Arrays.toString(arrStrChange));

        ArrayList arrStrNewArr = arrStr.creatArrList();

        System.out.println( arrStrNewArr);

        System.out.println("args = " + Arrays.deepToString(arrInt.changeArr(0,5)));

    }

}
