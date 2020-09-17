package recursion;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//sort an array using recursion
public class Sort {

    public static void main(String[] args) {
        Integer[] arr = {5,6,2,10,1};
        Sort sort = new Sort();
        List<Integer> list = new LinkedList<>(Arrays.asList(arr));
        sort.sortArray(list, arr.length);
        list.size();
    }

    private void sortArray(List<Integer> list, Integer n) {

        if(n == 0) {
            return;
        }
        System.out.println("n is " + n);
        int temp = list.get(n-1);
        list.remove(n-1);
        sortArray(list, n-1);
        insert(list,temp);
    }

    private void insert(List<Integer> list, Integer temp) {
        if( list.isEmpty() || list.get(list.size()-1) < temp) {
            list.add(temp);
            return;
        }

        int var = list.get(list.size()-1);
        list.remove(list.size()-1);
        insert(list, temp);
        list.add(var);
    }
}
