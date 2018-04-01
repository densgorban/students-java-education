package sort;

import java.util.Collection;

public class BubbleSort implements SortInterface {

    @Override
    public int[] sort(int[] intArr) {
        int count = 0;

        while (count++ != intArr.length){
            for (int i = 0; i < intArr.length-1; i++) {
                if(intArr[i] > intArr[i+1]) {
                    int a = intArr[i];
                    intArr[i] = intArr[i+1];
                    intArr[i+1] = a;
                }
            }
        }
        return intArr;
    }
}
