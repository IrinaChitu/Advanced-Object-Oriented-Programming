package lab2.tasks.task3;

public class Search {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 6, 9, 12 ,22 ,7 ,20};
        copySubstring(array, 9);
    }
    static void copySubstring(Integer[] arr, Integer elem) {
        int index = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == elem) {
                index = i;
                break;
            }
        }
        if(index != -1) {
            Integer[] copyArr = java.util.Arrays.copyOfRange(arr, index, arr.length);
            System.out.println(copyArr.toString());
            for(Integer x: copyArr) {
                System.out.print(x + " ");
            }
        }
    }
}
